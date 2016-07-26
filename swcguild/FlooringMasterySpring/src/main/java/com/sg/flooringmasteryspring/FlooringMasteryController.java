/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring;

import com.sg.flooringmasteryspring.dao.FlooringMasteryDAOProd;
import com.sg.flooringmasteryspring.ui.FlooringMasteryUI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class FlooringMasteryController {

    FlooringMasteryDAOProd dao;// = new FlooringMasteryDAOProd();
    FlooringMasteryUI ui;// = new FlooringMasteryUI();
    FlooringMasteryOps ops = new FlooringMasteryOps();
    public FlooringMasteryController() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao = (FlooringMasteryDAOProd) ctx.getBean("DAOProd");
        //ui = (FlooringMasteryUI) ctx.getBean("FlooringUI");
    }

    public void run() {

        

        dao.readInStates();
        dao.readInProducts();
        dao.readInOrders();
        dao.setCurrentOrderNumber();

        int userSelection = 0;
        int unsaved = 0;
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
                    dao.removeOrder(ui.removeByDayAndOrderNum());
                    unsaved++;
                    break;
                case 6://SAVE CHANGES TO FILE
                    ui.resultOfSaveOperation(dao.saveChangesToFile(dao.getWorkingList()));
                    break;
                case 7://EXIT
                    if (ui.confirmExitIfUnsaved(unsaved)) {
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }
}
