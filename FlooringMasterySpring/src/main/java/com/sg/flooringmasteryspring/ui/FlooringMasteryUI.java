package com.sg.flooringmasteryspring.ui;

import com.sg.flooringmasteryspring.dao.FlooringMasteryDAOUserXML;
import com.sg.flooringmasteryspring.dao.ProductsDAOInterface;
import com.sg.flooringmasteryspring.dto.Order;
import com.sg.flooringmasteryspring.dto.Product;
import com.sg.flooringmasteryspring.dto.User;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class FlooringMasteryUI {

    ConsoleIO console;
    FormattingUtils fu;
    ProductsDAOInterface prodList;

    public FlooringMasteryUI(ConsoleIO console, FormattingUtils fu, ProductsDAOInterface prodList) {
        this.console = console;
        this.fu = fu;
        this.prodList = prodList;

    }

    public int displayMenu() {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ========================================");
        console.promptForPrintPrompt("                          |======================================|");
        console.promptForPrintPrompt("                          |          FLOORING ORDERS MENU        |");
        console.promptForPrintPrompt("                          |======================================|");
        console.promptForPrintPrompt("                          |======================================|");
        console.promptForPrintPrompt("                          || 1.  ADD NEW ORDER                  ||");
        console.promptForPrintPrompt("                          || 2.  VIEW ALL ORDERS ON A GIVEN DAY ||");
        console.promptForPrintPrompt("                          || 3.  VIEW A SINGLE ORDER            ||");
        console.promptForPrintPrompt("                          || 4.  EDIT AN EXISTING ORDER         ||");
        console.promptForPrintPrompt("                          || 5.  REMOVE AN ORDER                ||");
        console.promptForPrintPrompt("                          || 6.  SAVE CHANGES TO FILE           ||");
        console.promptForPrintPrompt("                          || 7.  ADMINISTRATOR MODE             ||");
        console.promptForPrintPrompt("                          || 8.  QUIT PROGRAM                   ||");
        console.promptForPrintPrompt("                          ========================================");

        return console.promptForIntWithRange("                          ||  PLEASE MAKE A SELECTION: ", 1, 8);
    }

    public int displayMenuLogin() {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ========================================");
        console.promptForPrintPrompt("                          |======================================|");
        console.promptForPrintPrompt("                          |              ADMIN LOGIN             |");
        console.promptForPrintPrompt("                          |======================================|");
        console.promptForPrintPrompt("                          |======================================|");
        console.promptForPrintPrompt("                          || 1.  LOG IN TO YOUR ACCOUNT         ||");
        console.promptForPrintPrompt("                          || 2.  CREATE NEW ACCOUNT             ||");
        console.promptForPrintPrompt("                          || 3.  CHANGE PASSWORD                ||");
        console.promptForPrintPrompt("                          || 4.  RETURN TO MAIN MENU            ||");
        console.promptForPrintPrompt("                          ========================================");

        return console.promptForIntWithRange("                          ||  PLEASE MAKE A SELECTION: ", 1, 4);
    }

    public int displayMenuAdmin() {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ========================================");
        console.promptForPrintPrompt("                          |======================================|");
        console.promptForPrintPrompt("                          |          ADMINISTRATOR MENU          |");
        console.promptForPrintPrompt("                          |======================================|");
        console.promptForPrintPrompt("                          |======================================|");
        console.promptForPrintPrompt("                          || 1.  ADD PRODUCT TO SYSTEM          ||");
        console.promptForPrintPrompt("                          || 2.  CHANGE STATE TAX RATE          ||");
        console.promptForPrintPrompt("                          || 3.  VIEW LIST OF CANCELED ORDERS   ||");
        console.promptForPrintPrompt("                          || 4.                                 ||");
        console.promptForPrintPrompt("                          || 5.                                 ||");
        console.promptForPrintPrompt("                          || 6.  SAVE CHANGES TO FILE           ||");
        console.promptForPrintPrompt("                          || 7.  RETURN TO MAIN MENU            ||");
        console.promptForPrintPrompt("                          ========================================");

        return console.promptForIntWithRange("                          ||  PLEASE MAKE A SELECTION: ", 1, 7);
    }

    public Order add() {

        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          + PLEASE ENTER INFORMATION FOR A NEW ORDER +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");

        String custName = console.promptForString("                          ||  CUSTOMER: ");
        String state;
        do {
            state = console.promptForString("                          ||  STATE: ");
            if (!fu.amIaState(state)) {
                console.promptForPrintPrompt("                          ||  PLEASE ENTER A VALID STATE");
            }
        } while (!fu.amIaState(state));
        String floorType;
        do {
            console.promptForPrintPrompt("                          ||  CURRENT PRODUCTS: ");
            prodList.getProductList().stream().forEach((a) -> {
                console.promptForPrintPrompt(a.toString());
            });
            floorType = console.promptForString("                          ||  TYPE OF FLOORING: ");
            if (!fu.checkProductForInStock(floorType)) {
                console.promptForPrintPrompt("                          ||  PLEASE ENTER A VALID CHOICE");
            }
        } while (!fu.checkProductForInStock(floorType));
        String area;
        do {
            area = console.promptForString("                          ||  AREA TO FLOOR (SqFt): ");
            if (!fu.areaRangeCheck(area)) {
                console.promptForPrintPrompt("                          ||  PLEASE ENTER A VALID CHOICE: 100,000 SqFt MAX");
            }
        } while (!fu.areaRangeCheck(area));
        String orderDate = new SimpleDateFormat("MMddyyyy").format(Calendar.getInstance().getTime());
        Order toProcess = new Order(1, fu.nameFormatter(custName), fu.formatState(state), 1, fu.productFormatter(floorType), Double.parseDouble(area), 1, 1, 1, 1, 1, 1, orderDate, false);

        return toProcess;
    }

    public Product addProduct() {
        console.promptForPrintPrompt("\n\n\n");
        System.out.println("needs input checking!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +      PLEASE ENTER PRODUCT INFORMATION    +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          ||  CURRENT PRODUCTS: ");
        prodList.getProductList().stream().forEach((a) -> {
            console.promptForPrintPrompt(a.toString());
        });
        String name = console.promptForString("                          ||  PRODUCT NAME: ");
        String costStr = console.promptForString("                          ||  MATERIAL COST PER SQFT: $ ");
        String laborStr = console.promptForString("                          ||  LABOR COST PER SQFT: $ ");
        Product toAdd = new Product(name, Double.parseDouble(String.format("%.2f", costStr)), Double.parseDouble(String.format("%.2f", laborStr)));
        return toAdd;
    }

    public User addUser() {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +          PLEASE CREATE NEW ACCOUNT       +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        String name = console.promptForString("                          ||  USER NAME: ");///ADD CHECK FOR EXISTING
        String password1 = "";
        String password2 = "";
        do {
            password1 = console.promptForString("                          ||  PASSWORD: ");
            password2 = console.promptForString("                          ||  PASSWORD: ");
        } while (!password1.equals(password2));

        User toAdd = new User(name, password1, fu.randomAlphaNumeric(6));
        return toAdd;
    }

    public String[] loginToAdmin() {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +                 PLEASE LOG IN            +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        String name = console.promptForString("                          ||  USER NAME: ");
        String password = console.promptForString("                          ||  PASSWORD: ");

        String[] loginInfo = {name, password};
        return loginInfo;
    }

    public void badUser() {
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +       INCORRECT USERNAME OR PASSWORD     +");
        console.promptForPrintPrompt("                          +         USERNAMES AND PASSWORDS ARE      +");
        console.promptForPrintPrompt("                          +              !!CASE SENSITIVE!!          +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void createNewUserPrompt() {
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +       CREATING NEW ACCOUNT REQUIRES      +");
        console.promptForPrintPrompt("                          +                ADMIN APPROVAL            +");
        console.promptForPrintPrompt("                          +      !!ADMIN LONG IN NOW TO CONFIRM!!    +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");

    }

    public String[] changeStateTaxRate() {
        console.promptForPrintPrompt("\n\n\n");
        System.out.println("needs input checking on tax rate!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +         PLEASE ENTER STATE TO CHANGE     +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        String state;
        do {
            state = console.promptForString("                          ||  STATE: ");
            if (!fu.amIaState(state)) {
                console.promptForPrintPrompt("                          ||  PLEASE ENTER A VALID STATE");
            }
        } while (!fu.amIaState(state));
        String taxRate = console.promptForString("                          ||  NEW RATE (0.0xxx FORMAT) ):  ");
        String[] toChange = {fu.formatState(state), taxRate};
        return toChange;
    }

    public void confirmNewTaxRate() {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +            STATE TAX RATE UPDATED        +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void confirmNewProduct() {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +          PRODUCT ADDED TO DATABASE       +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
    }

    public boolean confirmAdd(int orderNumber) {
        String orderDate = new SimpleDateFormat("MMddyyyy").format(Calendar.getInstance().getTime());
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +             ORDER CONFIRMATION           +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          ||  THANK YOU FOR YOUR ORDER");
        console.promptForPrintPrompt("                          ||  PLEASE SAVE THIS FOR YOUR RECORDS");
        console.promptForPrintPrompt("                          ||  YOUR ORDER NUMBER IS " + orderNumber + " PLACED ON " + orderDate + "\n");
        return true;
    }

    public String[] searchByDay() {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          +++++++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +        PLEASE ENTER DATE TO SEARCH FOR        +");
        console.promptForPrintPrompt("                          +++++++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          ||  MMDDYYYY FORMAT PLEASE");
        String date;
        do {
            date = console.promptForString("                          ||  DATE: ");
            if (!fu.dateChecker(date)) {
                System.out.println("                          ||  DATE MUST BE MMDDYYYY PLEASE");
            }
        } while (!fu.dateChecker(date));

        String[] passSearch = {date, "-1"};
        return passSearch;

    }

    public String[] searchByDayAndOrderNum() {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          +++++++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +       PLEASE ENTER DATE AND ORDER NUMBER      +");
        console.promptForPrintPrompt("                          +++++++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          ||  MMDDYYYY FORMAT PLEASE");
        String date;
        do {
            date = console.promptForString("                          ||  DATE: ");
            if (!fu.dateChecker(date)) {
                System.out.println("                          ||  DATE MUST BE MMDDYYYY PLEASE");
            }
        } while (!fu.dateChecker(date));
        String orderNum;
        do {
            orderNum = console.promptForString("                          ||  ORDER NUMBER: ");
        } while (fu.orderNumberRangeCheck(orderNum) == false);
        String[] passSearch = {date, orderNum};
        return passSearch;

    }

    public String[] toEditFields() {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          +++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          + PLEASE ENTER THE INFORMATION YOU WOULD LIKE TO EDIT +");
        console.promptForPrintPrompt("                          +++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          ||  WOULD YOU LIKE TO EDIT NAME?");
        console.promptForPrintPrompt("                          ||  ENTER (1)YES OR (2)NO\n");
        int choice = console.promptForIntWithRange("                          ||  YOUR SELECTION: ", 1, 2);
        String name = "";
        if (choice == 1) {
            name = console.promptForString("                          ||  NEW NAME: ");
            name = fu.nameFormatter(name);
        } else if (choice == 2) {
            System.out.println("\n                          ||  KEEPING EXISTING NAME");
        }
        console.promptForPrintPrompt("                          ||  WOULD YOU LIKE TO EDIT STATE?");
        console.promptForPrintPrompt("                          ||  ENTER (1)YES OR (2)NO\n");
        int choice1 = console.promptForIntWithRange("                          ||YOUR SELECTION: ", 1, 2);
        String state = "";
        if (choice1 == 1) {
            do {
                state = console.promptForString("                          ||  STATE: ");
                if (!fu.amIaState(state)) {
                    console.promptForPrintPrompt("                          ||  PLEASE ENTER A VALID STATE");
                }
                state = fu.formatState(state);
            } while (!fu.amIaState(state));
        } else if (choice1 == 2) {
            System.out.println("\n                          ||  KEEPING CURRENT STATE");
        }
        console.promptForPrintPrompt("                          ||  WOULD YOU LIKE TO EDIT FLOOR TYPE?");
        console.promptForPrintPrompt("                          ||  ENTER (1)YES OR (2)NO\n");
        int choice2 = console.promptForIntWithRange("                          ||  YOUR SELECTION: ", 1, 2);
        String floorType = "";
        if (choice2 == 1) {
            do {
                console.promptForPrintPrompt("                          ||  CURRENT PRODUCTS: ");
                prodList.getProductList().stream().forEach((a) -> {
                    console.promptForPrintPrompt(a.toString());
                });
                floorType = console.promptForString("                          ||  NEW FLOORING TYPE: ");
                if (!fu.checkProductForInStock(floorType)) {
                    console.promptForPrintPrompt("                          ||  PLEASE ENTER A VALID CHOICE");
                }
                floorType = fu.productFormatter(floorType);
            } while (!fu.checkProductForInStock(floorType));
        } else if (choice2 == 2) {
            System.out.println("\n                          ||  KEEPING EXISTING FLOORING");
        }
        console.promptForPrintPrompt("                          ||  WOULD YOU LIKE TO EDIT AREA?");
        console.promptForPrintPrompt("                          ||  ENTER (1)YES OR (2)NO\n");
        int choice3 = console.promptForIntWithRange("                          ||  YOUR SELECTION: ", 1, 2);
        String area = "";
        if (choice3 == 1) {
            do {
                area = console.promptForString("                          ||  AREA TO FLOOR (SqFt): ");
                if (!fu.areaRangeCheck(area)) {
                    console.promptForPrintPrompt("                          ||  PLEASE ENTER A VALID CHOICE: 100,000 SqFt MAX");
                }
            } while (!fu.areaRangeCheck(area));
        } else if (choice3 == 2) {
            System.out.println("\n                          ||  KEEPING EXISTING AREA");
        }

        String[] toEdit = {name, state, floorType, area};
        return toEdit;

    }

    public String[] removeByDayAndOrderNum() {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          +++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +   PLEASE ENTER THE ORDER YOU WOULD LIKE TO REMOVE   +");
        console.promptForPrintPrompt("                          +++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          || MMDDYYYY FORMAT ONLY");
        String date;
        do {
            date = console.promptForString("                          ||  DATE: ");
            if (!fu.dateChecker(date)) {
                System.out.println("                          ||  DATE MUST BE MMDDYYYY PLEASE");
            }
        } while (!fu.dateChecker(date));
        String orderNum;
        do {
            orderNum = console.promptForString("                          ||  ORDER NUMBER: ");
        } while (fu.orderNumberRangeCheck(orderNum) == false);

        String[] passSearch = {date, orderNum};
        return passSearch;

    }

    public void resultOfRemoveOperation(boolean didItRemove) {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +             REMOVE CONFIRMATION          +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");

        if (didItRemove == false) {

            console.promptForPrintPrompt("                          ||  ERROR: ORDER NOT REMOVED\n\n\n");
        } else {
            console.promptForPrintPrompt("                          ||  ORDER SUCCESSFULLY CANCELED!\n\n\n");
        }
    }

    public void resultOfSaveOperation(boolean didItSave) {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +              SAVE CONFIRMATION           +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");

        if (didItSave == false) {

            console.promptForPrintPrompt("                          ||  FEATURE DISABLED IN THIS CONFIGURATION\n\n\n");
        } else {
            console.promptForPrintPrompt("                          ||  CHANGES SUCCESSFULLY SAVED!\n\n\n");
        }
    }

    public void listAll(List<Order> listToPrint) {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +              ORDERS TO DISPLAY           +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        if (listToPrint.isEmpty()) {
            console.promptForPrintPrompt("\n                          ||  NO ORDER(S) TO DISPLAY");
            console.promptForPrintPrompt("                          ||  SORRY! NOT SORRY...\n\n\n");
        } else {
            listToPrint.stream().forEach((a) -> {
                console.promptForPrintPrompt(a.toString());
            });
        }
    }

    public void listAllCanceled(List<Order> listToPrint) {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +               CANCELED ORDERS            +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        if (listToPrint.isEmpty()) {
            console.promptForPrintPrompt("\n                          ||  NO ORDER(S) TO DISPLAY");
            console.promptForPrintPrompt("                          ||  SORRY! NOT SORRY...\n\n\n");
        } else {
            listToPrint.stream().forEach((a) -> {
                console.promptForPrintPrompt(a.toString());
            });
        }
    }

    public boolean confirmRemove(List<Order> listToPrint) {
        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                          +               ORDER TO REMOVE            +");
        console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
        if (listToPrint.isEmpty()) {
            console.promptForPrintPrompt("\n                          ||  NO ORDER(S) TO DISPLAY");
            console.promptForPrintPrompt("                          ||  SORRY! NOT SORRY...\n\n\n");
        } else {
            listToPrint.stream().forEach((a) -> {
                console.promptForPrintPrompt(a.toString());
            });
        }
        console.promptForPrintPrompt("\n                          ||  ARE YOU SURE YOU WANT TO REMOVE THIS ORDER?");
        console.promptForPrintPrompt("                          ||  PLEASE PRESS (1) TO REMOVE");
        console.promptForPrintPrompt("                          ||  PRESS (2) TO EXIT WITHOUT CHANGES\n");
        int choice = console.promptForIntWithRange("                          ||  YOUR SELECTION: ", 1, 2);
        if (choice == 1) {
            return true;
        } else {
            console.promptForPrintPrompt("                          ||  REMOVE OPERATION CANCELED\n");
            return false;
        }
    }

    public boolean confirmExitIfUnsaved(int checkForNew) {
        if (checkForNew == 0) {
            console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
            console.promptForPrintPrompt("                          +         THANKS FOR USING MY PROGRAM      +");
            console.promptForPrintPrompt("                          +                  GOODBYE!                +");
            console.promptForPrintPrompt("                          ++++++++++++++++++++++++++++++++++++++++++++");
            return false;
        }

        console.promptForPrintPrompt("\n                          ||  ARE YOU SURE YOU WANT TO EXIT?");
        console.promptForPrintPrompt("                          ||  YOU HAVE UNSAVED CHANGES.");
        console.promptForPrintPrompt("                          ||  PLEASE PRESS (1) TO SAVE");
        console.promptForPrintPrompt("                          ||  PRESS (2) TO EXIT WITHOUT SAVING\n\n");
        int choice = console.promptForIntWithRange("                          ||  YOUR SELECTION: ", 1, 2);
        if (choice == 1) {
            return true;
        } else {
            return false;
        }

    }

}
