/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring.ui;

import com.sg.flooringmasteryspring.dto.Order;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class FlooringMasteryUI  {

    ConsoleIO console= new ConsoleIO();
    FormattingUtils fu= new FormattingUtils();


   
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
        console.promptForPrintPrompt("                          || 7.  QUIT PROGRAM                   ||");
        console.promptForPrintPrompt("                          ========================================");

        return console.promptForIntWithRange("                          PLEASE MAKE A SELECTION: ", 1, 7);
    }

   
    public Order add() {

        console.promptForPrintPrompt("\n\n\n");
        console.promptForPrintPrompt("                        ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                        + PLEASE ENTER INFORMATION FOR A NEW ORDER +");
        console.promptForPrintPrompt("                        ++++++++++++++++++++++++++++++++++++++++++++");

        String custName = console.promptForString("                          CUSTOMER: ");
        String state;
        do {
            state = console.promptForString("                          STATE: ");
            if (!fu.amIaState(state)) {
                console.promptForPrintPrompt("                          PLEASE ENTER A VALID STATE");
            }
        } while (!fu.amIaState(state));
        String floorType;
        do {
            console.promptForPrintPrompt("                          CURRENT STOCK: CARPET || LAMINATE || TILE || WOOD ");
            floorType = console.promptForString("                          TYPE OF FLOORING: ");
            if (!fu.CheckProductForInStock(floorType)) {
                console.promptForPrintPrompt("                          PLEASE ENTER A VALID CHOICE");
            }
        } while (!fu.CheckProductForInStock(floorType));
        String area;
        do {
            area = console.promptForString("                          AREA TO FLOOR (SqFt): ");
            if (!fu.areaRangeCheck(area)) {
                console.promptForPrintPrompt("                          PLEASE ENTER A VALID CHOICE: 100,000 SqFt MAX");
            }
        } while (!fu.areaRangeCheck(area));
        String orderDate = new SimpleDateFormat("MMddyyyy").format(Calendar.getInstance().getTime());
        Order toProcess = new Order(1, fu.nameFormatter(custName), fu.formatState(state), 1, fu.productFormatter(floorType), Double.parseDouble(area), 1, 1, 1, 1, 1, 1, orderDate);

        return toProcess;
    }

   
    public boolean confirmAdd(int orderNumber) {
        String orderDate = new SimpleDateFormat("MMddyyyy").format(Calendar.getInstance().getTime());
        console.promptForPrintPrompt("\n\n\n                          THANK YOU FOR YOUR ORDER");
        console.promptForPrintPrompt("                          PLEASE SAVE THIS FOR YOUR RECORDS");
        console.promptForPrintPrompt("                          YOUR ORDER NUMBER IS " + orderNumber + " PLACED ON " + orderDate);
        return true;
    }

  
    public String[] searchByDay() {
        console.promptForPrintPrompt("");
        console.promptForPrintPrompt("                          PLEASE ENTER DATE TO SEARCH FOR: ");
        console.promptForPrintPrompt("                          MMDDYYYY format please");
        String date;
        do {
            date = console.promptForString("                          Date: ");
            if (!fu.DateChecker(date)) {
                System.out.println("                          DATE MUST BE MMDDYYYY PLEASE");
            }
        } while (!fu.DateChecker(date));

        String[] passSearch = {date, "-1"};
        return passSearch;

    }

    
    public String[] searchByDayAndOrderNum() {
        console.promptForPrintPrompt("");
        console.promptForPrintPrompt("                          PLEASE ENTER ORDER TO SEARCH FOR:");
        console.promptForPrintPrompt("                          MMDDYYYY format");
        String date;
        do {
            date = console.promptForString("                          Date: ");
            if (!fu.DateChecker(date)) {
                System.out.println("                          DATE MUST BE MMDDYYYY PLEASE");
            }
        } while (!fu.DateChecker(date));
        String orderNum;
        do {
            orderNum = console.promptForString("                          Order Number: ");
        } while (fu.OrderNumberRangeCheck(orderNum) == false);
        String[] passSearch = {date, orderNum};
        return passSearch;

    }

 
    public String[] toEditFields() {
        console.promptForString("");
        console.promptForPrintPrompt("                          PLEASE EDIT FIELDS");
        console.promptForPrintPrompt("                          Leave Blank if you want to keep current value ");
        String name = console.promptForString("                          New Name: ");
        String state;
        do {
            state = console.promptForString("                          STATE: ");
            if (!fu.amIaState(state)) {
                console.promptForPrintPrompt("                          PLEASE ENTER A VALID STATE");
            }
        } while (!fu.amIaState(state));
        String floorType;
        do {
            console.promptForPrintPrompt("                          CURRENT STOCK: CARPET || LAMINATE || TILE || WOOD ");
            floorType = console.promptForString("                          NEW FLOORING TYPE: ");
            if (!fu.CheckProductForInStock(floorType)) {
                console.promptForPrintPrompt("                          PLEASE ENTER A VALID CHOICE");
            }
        } while (!fu.CheckProductForInStock(floorType));
        String area;
        do {
            area = console.promptForString("                          AREA TO FLOOR (SqFt): ");
            if (!fu.areaRangeCheck(area)) {
                console.promptForPrintPrompt("                          PLEASE ENTER A VALID CHOICE: 100,000 SqFt MAX");
            }
        } while (!fu.areaRangeCheck(area));
        String[] toEdit = {fu.nameFormatter(name), fu.formatState(state), fu.productFormatter(floorType), area};
        return toEdit;

    }

    
    public String[] removeByDayAndOrderNum() {

        console.promptForPrintPrompt("                          PLEASE ENTER ORDER TO REMOVE: ");
        console.promptForPrintPrompt("                          MMDDYYYY FORMAT ONLY");
        String date;
        do {
            date = console.promptForString("                          DATE: ");
            if (!fu.DateChecker(date)) {
                System.out.println("                          DATE MUST BE MMDDYYYY PLEASE");
            }
        } while (!fu.DateChecker(date));
        String orderNum;
        do {
            orderNum = console.promptForString("                          ORDER NUMBER: ");
        } while (fu.OrderNumberRangeCheck(orderNum) == false);

        String[] passSearch = {date, orderNum};
        return passSearch;

    }

   
    public void resultOfSaveOperation(boolean didItSave) {
        if (didItSave == false) {

            console.promptForPrintPrompt("                          FEATURE DISABLED IN THIS CONFIGURATION\n\n\n");
        } else {
            console.promptForPrintPrompt("                          CHANGES SUCCESSFULLY SAVED!\n\n\n");
        }
    }

    
    public void listAll(List<Order> listToPrint) {
        if (listToPrint.isEmpty()) {
            console.promptForPrintPrompt("                                     NO ORDER(S) TO DISPLAY");
            console.promptForPrintPrompt("                                       SORRY! NOT SORRY...\n\n\n");
        } else {
            listToPrint.stream().forEach((a) -> {
                console.promptForPrintPrompt(a.toString());
            });
        }
    }

  
    public boolean confirmExitIfUnsaved(int checkForNew) {
        if (checkForNew == 0) {
            console.promptForPrintPrompt("                                     THANKS FOR USING MY PROGRAM!");
            console.promptForPrintPrompt("                                               GOODBYE!");
            return false;
        }

        console.promptForPrintPrompt("                                       ARE YOU SURE YOU WANT TO EXIT?");
        console.promptForPrintPrompt("                                          YOU HAVE UNSAVED CHANGES.");
        console.promptForPrintPrompt("                                     PLEASE PRESS (1) TO RETURN AND SAVE");
        console.promptForPrintPrompt("                                       PRESS (2) TO EXIT WITHOUT SAVING\n\n");
        int choice = console.promptForIntWithRange("                                          YOUR SELECTION: ", 1, 2);
        return choice == 1;
    }

}
