package com.sg.flooringmasteryspring;

import com.sg.flooringmasteryspring.dao.FlooringMasteryDAOAdminMode;
import com.sg.flooringmasteryspring.dao.FlooringMasteryDAOProducts;
import com.sg.flooringmasteryspring.dao.FlooringMasteryDAOStates;
import com.sg.flooringmasteryspring.dao.FlooringMasteryDAOUserXML;
import com.sg.flooringmasteryspring.dao.FlooringMasteryInterface;
import com.sg.flooringmasteryspring.dao.ProductsDAOInterface;
import com.sg.flooringmasteryspring.dao.StatesDAOInterface;
import com.sg.flooringmasteryspring.dto.Product;
import com.sg.flooringmasteryspring.ops.FlooringMasteryOps;
import com.sg.flooringmasteryspring.ui.FlooringMasteryUI;

//@author CASEY
public class FlooringMasteryController {

    FlooringMasteryInterface dao;
    FlooringMasteryUI ui;
    StatesDAOInterface states;
    ProductsDAOInterface products;
    FlooringMasteryOps ops;
    FlooringMasteryDAOAdminMode admin;
    FlooringMasteryDAOUserXML userDAO;

    public FlooringMasteryController(FlooringMasteryInterface dao, FlooringMasteryUI ui, StatesDAOInterface states, ProductsDAOInterface products, FlooringMasteryOps ops, FlooringMasteryDAOAdminMode admin, FlooringMasteryDAOUserXML userDAO) {
        this.dao = dao;
        this.ui = ui;
        this.states = states;
        this.products = products;
        this.ops = ops;
        this.admin = admin;
        this.userDAO = userDAO;

    }

    int unsaved = 0;

    public void setup() {
        dao.readInOrders();
        dao.setCurrentOrderNumber();
        states.readInStates();
        products.readInProducts();
        dao.sortOutCanceledOrders();
        run();
    }

    public void run() {

        int userSelection = 0;
        while (userSelection != 7) {

            userSelection = ui.displayMenu();

            switch (userSelection) {

                case 1://ADD ORDER                                        
                    ui.confirmAdd(dao.addOrder(ops.buildOrder(ui.add())));
                    unsaved++;
                    break;

                case 2://VIEW ALL FOR DAY              
                    ui.listAll(dao.getByDayList(ui.searchByDay()));
                    break;

                case 3://VIEW SINGLE                    
                    ui.listAll(dao.getByDayList(ui.searchByDayAndOrderNum()));
                    break;

                case 4://EDIT EXISTING ORDER                                                                              
                    ops.buildOrder(ops.editOrder(dao.passToEdit(dao.getByDayList(ui.searchByDayAndOrderNum())), ui.toEditFields()));
                    unsaved++;
                    break;

                case 5://REMOVE AN ORDER                   
                    String[] toRemove = ui.removeByDayAndOrderNum();
                    if (ui.confirmRemove(dao.getByDayList(toRemove)) == true) {
                        ui.resultOfRemoveOperation(dao.removeOrder(toRemove));
                        unsaved++;
                        break;
                    } else {
                        break;
                    }
                case 6://SAVE CHANGES TO FILE
                    ui.resultOfSaveOperation(dao.saveChangesToFile(dao.getWorkingList()));
                    unsaved = 0;
                    break;
                case 7://CALL ADMIN MODE
                    adminLogin();
                    break;
                case 8://EXIT
                    if (ui.confirmExitIfUnsaved(unsaved) == true) {
                        ui.resultOfSaveOperation(dao.saveChangesToFile(dao.getWorkingList()));
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public void adminLogin() {

        int userSelectionLogin = 0;
        while (userSelectionLogin != 4) {

            userSelectionLogin = ui.displayMenuLogin();

            switch (userSelectionLogin) {

                case 1://LOG IN TO ADMIN                                                                               
                    if (userDAO.checkLogin(ui.loginToAdmin()) == true) {
                        adminMode();
                    } else {
                        ui.badUser();
                        break;
                    }
                case 2://CREATE NEW ADMIN ACCESS ACCOUNT
                    ui.createNewUserPrompt();
                    if (userDAO.checkLogin(ui.loginToAdmin()) == true) {
                        userDAO.addUser(ui.addUser());
                        break;
                    } else {
                        ui.badUser();
                        break;
                    }
                case 3://change password                    

                    break;

                case 4://RETURN TO MAIN MENU
                    run();
                    return;

                default:
                    return;
            }
        }

    }

    public void adminMode() {

        int userSelectionAdmin = 0;
        while (userSelectionAdmin != 7) {

            userSelectionAdmin = ui.displayMenuAdmin();

            switch (userSelectionAdmin) {

                case 1://ADD NEW PRODUCT                                                          
                    admin.addProduct(ui.addProduct());
                    ui.confirmNewProduct();
                    break;

                case 2://CHANGE STATE TAX RATE              
                    admin.changeStateTax(ui.changeStateTaxRate());
                    ui.confirmNewTaxRate();
                    break;

                case 3://VIEW ALL CANCELED ORDERS                    
                    ui.listAllCanceled(admin.listAllCanceled());
                    break;

                case 4://                                                                              

                case 5://                   

                    break;

                case 6://SAVE ALL CHANGES**********************
                    states.saveChangesToState();
                    products.saveChangesToProduct();
                    userDAO.saveChangesToUsers();
                    ui.resultOfSaveOperation(dao.saveChangesToFile(dao.getWorkingList()));
                    unsaved = 0;
                    break;
                case 7://RETURN TO MAIN MENU
                    run();
                    return;

                default:
                    return;
            }
        }

    }
}
