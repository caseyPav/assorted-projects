/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bankmanager.ui;

import com.sg.bankmanager.dto.Account;

/**
 *
 * @author apprentice
 */
public class BankManagerUI {

    ConsoleIO console = new ConsoleIO();
    Account a = new Account();

    public void welcome() {
        console.promptForPrintPrompt("WELCOME TO THE AUTOMATIC TELLER MACHINE MACHINE");
        console.promptForPrintPrompt("===============================================");
    }

    public int getPin() {
        int pin;
        console.promptForPrintPrompt("PLEASE ENTER YOUR PIN");
        pin = console.promptForInt("PIN: ");
        console.promptForString("");
        return pin;
    }

    public int displayMenu() {
        console.promptForPrintPrompt("      PLEASE SELECT AN OPTION");
        console.promptForPrintPrompt("=====================================");
        console.promptForPrintPrompt("          1. CHECK CHECKING BALANCE");
        console.promptForPrintPrompt("          2. CHECK SAVINGS BALANCE");
        console.promptForPrintPrompt("          3. DEPOSIT TO CHECKING");
        console.promptForPrintPrompt("          4. DEPOSIT TO SAVINGS");
        console.promptForPrintPrompt("          5. WITHDRAW FROM CHECKING");
        console.promptForPrintPrompt("          6. WITHDRAW FROM SAVINGS");
        console.promptForPrintPrompt("          7. EXIT");
        int userChoice = console.promptForInt("PLEASE SELECT AN OPTION:");
        console.promptForString("");
        return userChoice;
    }

    public void getCheckingBalance() {
        double cb = a.getCheckingBalance();
        console.promptForPrintPrompt("      CHECKING ACCOUNT BALANCE");
        console.promptForPrintPrompt("=====================================");
        console.promptForPrintPrompt("CURRENT BALANCE: $" + cb);
    }

    public void getSavingsBalance() {
        double sb = a.getSavingsBalance();
        console.promptForPrintPrompt("      SAVINGS ACCOUNT BALANCE");
        console.promptForPrintPrompt("=====================================");
        console.promptForPrintPrompt("CURRENT BALANCE: $" + sb);
    }

    public int checkingDepositUI() {
        console.promptForPrintPrompt("      DEPOSIT TO CHECKING");
        console.promptForPrintPrompt("=====================================");
        int deposit = console.promptForInt("AMOUNT: $");
        console.promptForString("");
        return deposit;
    }

    public int savingsDepositUI() {
        console.promptForPrintPrompt("      DEPOSIT TO SAVINGS");
        console.promptForPrintPrompt("=====================================");
        int deposit = console.promptForInt("AMOUNT: $");
        console.promptForString("");
        return deposit;
    }

    public int withdrawUI() {
        console.promptForPrintPrompt("           WITHDRAW               ");
        console.promptForPrintPrompt("=====================================");
        int withdraw = console.promptForInt("AMOUNT TO WITHDRAW: $");
        console.promptForString("");
        return withdraw;
    }

    public void isfUI() {
        console.promptForPrintPrompt("+++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("+   YOU ARE TOO POOR TO     +");
        console.promptForPrintPrompt("+ WITHDRAW THIS AMOUNT OF   +");
        console.promptForPrintPrompt("+        MONEY              +");
        console.promptForPrintPrompt("+++++++++++++++++++++++++++++");

    }

    public void managerApproval() {
        console.promptForPrintPrompt("+++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("+   DUE TO FEDERAL RECORD   +");
        console.promptForPrintPrompt("+ KEEPING LAWS YOUR DEPOSIT +");
        console.promptForPrintPrompt("+ REQUIRES MANAGER APPROVAL +");
        console.promptForPrintPrompt("+++++++++++++++++++++++++++++");
    }
}
