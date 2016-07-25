/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.ui;

import com.sg.vendingmachine.dto.InventoryList;
import com.sg.vendingmachine.dto.Item;

/**
 *
 * @author casey
 */
public class VendingMachineUI {

    private ConsoleIO console = new ConsoleIO();

    public void welcomeText() {
        console.promptForPrintPrompt("====================");
        console.promptForPrintPrompt("||    WELCOME     ||");
        console.promptForPrintPrompt("||     To My      ||");
        console.promptForPrintPrompt("||VENDING MACHINE ||");
        console.promptForPrintPrompt("====================");
    }

    //UI for print all contents inStock
    public void listAll(InventoryList inStock) {
        for (Item a : inStock.getInventoryList()) {
            if (1 >= a.getCount()) {
                console.promptForPrintPrompt(a.toString());
            }
        }
    }

    //UI to add money
    public double getMoney() {
        double wallet = console.promptForDouble("PLEASE ENTER SOME MONEY: ");
        return wallet;

    }
    
    //UI to make selection
        public String chooseItem() {
        console.promptForString("");
        console.promptForPrintPrompt("PLEASE ENTER THE NAME OF THE ITEM TO PURCHASE");
        console.promptForPrintPrompt("-----------------------");
        String toBuy = console.promptForString("BUY: ");

        return toBuy;
    }

}
