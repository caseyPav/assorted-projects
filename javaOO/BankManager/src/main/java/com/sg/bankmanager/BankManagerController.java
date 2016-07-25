/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bankmanager;

import com.sg.bankmanager.dto.Account;
import com.sg.bankmanager.dto.Checking;
import com.sg.bankmanager.dto.Saving;
import com.sg.bankmanager.ui.BankManagerUI;

/**
 *
 * @author apprentice
 */
public class BankManagerController {

    public void run() {
        BankManagerUI ui = new BankManagerUI();
        Account a = new Account();
        Checking c = new Checking();
        Saving s = new Saving();

        ui.welcome();
        int pin = ui.getPin();
        if (a.checkPin(pin) == true) {
            int userSelection = 0;
            while (userSelection != 7) {

                userSelection = ui.displayMenu();

                switch (userSelection) {
                    case 1://display checking balance
                        ui.getCheckingBalance();
                        break;
                    case 2://display savings balance 
                        ui.getSavingsBalance();
                        break;
                    case 3://deposit checking 
                        int dc = ui.checkingDepositUI();
                        if (c.deposit(dc) == false) {
                            ui.managerApproval();
                        }
                        ;
                        break;
                    case 4://deposit savings
                        int ds = ui.savingsDepositUI();
                        if (s.deposit(ds) == false) {
                            ui.managerApproval();
                        }
                        ;
                        break;
                    case 5://withdraw checking
                        int wc = ui.withdrawUI();
                        if (c.withdrawl(wc) == false) {
                            ui.isfUI();
                        }
                        break;
                    case 6://withdraw savings
                        int ws = ui.withdrawUI();
                        if (s.withdrawl(ws) == false) {
                            ui.isfUI();
                        }
                        break;
                }
            }

        } else {
            ui.getPin();
        }

    }

}
