/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.ui;

import com.sg.addressbook.dto.Address;
import com.sg.addressbook.dto.AddressBookList;

/**
 *
 * @author apprentice
 */
public class AddressBookUI {

    private ConsoleIO console = new ConsoleIO();
 

    public int displayMenu() {

        console.promptForPrintPrompt("ADDRESS BOOK MENU");
        console.promptForPrintPrompt("=================");
        console.promptForPrintPrompt("1. ADD ADDRESS");
        console.promptForPrintPrompt("2. DELETE ADDRESS");
        console.promptForPrintPrompt("3. FIND ADDRESS");
        console.promptForPrintPrompt("4. LIST ADDRESS COUNT");
        console.promptForPrintPrompt("5. LIST ALL ADDRESSES");
        console.promptForPrintPrompt("6. EDIT ADDRESS");
        console.promptForPrintPrompt("7. QUIT");

        return console.promptForIntWithRange("Please Select an Option: ", 1, 7);
    }

    public Address add() {
        console.promptForPrintPrompt("PLEASE ENTER INFORMATION FOR A NEW ENTRY");
        console.promptForPrintPrompt("++++++++++++++++++++++++++++++++++++++++");
        console.promptForString("");
        String firstName = console.promptForString("FIRST NAME: ");
        String lastName = console.promptForString("LAST NAME: ");
        String street = console.promptForString("STREET: ");
        String city = console.promptForString("CITY: ");
        String state = console.promptForString("STATE: ");
        String zip = console.promptForString("ZIP: ");

        Address add = new Address(firstName, lastName, street, city, state, zip);

        return add;
    }

    public String remove() {
        console.promptForString("");
        console.promptForPrintPrompt("ENTER NAME TO REMOVE");
        console.promptForPrintPrompt("--------------------");
        String lastName = console.promptForString("LAST NAME: ");
        return lastName;
    }

    public void printList(String list) {
        console.promptForPrintPrompt(list);
    }

    public void size(AddressBookList abl) {
        console.promptForString("");
        int size = abl.addressList.size();
        console.promptForPrintPrompt("CURRENT NUMBER OF ENTRIES:  ");
        console.promptForPrintInt(size);
    }

    public void listAll(AddressBookList addressbook) {

        for (Address a : addressbook.addressList) {
            console.promptForPrintPrompt(a.toString());
        }
    }

    public String findLastName() {
        console.promptForString("");
        console.promptForPrintPrompt("ENTER LAST NAME TO FIND");
        console.promptForPrintPrompt("--------------------");
        String lastName = console.promptForString("LAST NAME: ");

        return lastName;
    }

    public void printFindLastName(Address print) {
        console.promptForPrintPrompt(print.toString());
    }

    public int printEditAddress(Address editTarget) {
        int choice;

        console.promptForPrintPrompt(editTarget.toString());
        console.promptForPrintPrompt("===========================");
        console.promptForPrintPrompt("PLEASE SELECT FIELD TO EDIT");
        console.promptForPrintPrompt("          1. FIRST NAME");
        console.promptForPrintPrompt("          2. LAST NAME");
        console.promptForPrintPrompt("          3. STREET");
        console.promptForPrintPrompt("          4. CITY");
        console.promptForPrintPrompt("          5. STATE");
        console.promptForPrintPrompt("          6. ZIP");
        console.promptForPrintPrompt("          7. EXIT");
        choice = console.promptForIntWithRange("PLEASE ENTER YOUR CHOICE", 1, 7);
        return choice;
    }

    public void editFirstName(Address toEdit) {
        console.promptForString("");
        String newFirst = console.promptForString("PLEASE ENTER NEW FIRST NAME: ");
        toEdit.setFirstName(newFirst);

    }

    public void editLastName(Address toEdit) {
        console.promptForString("");
        String newLast = console.promptForString("PLEASE ENTER NEW LAST NAME: ");
        toEdit.setLastName(newLast);

    }

    public void editStreet(Address toEdit) {
        console.promptForString("");
        String newStreet = console.promptForString("PLEASE ENTER NEW STREET: ");
        toEdit.setStreet(newStreet);

    }

    public void editCity(Address toEdit) {
        console.promptForString("");
        String newCity = console.promptForString("PLEASE ENTER NEW CITY: ");
        toEdit.setCity(newCity);

    }

    public void editState(Address toEdit) {
        console.promptForString("");
        String newState = console.promptForString("PLEASE ENTER NEW STATE: ");
        toEdit.setState(newState);

    }

    public void editZip(Address toEdit) {
        console.promptForString("");
        String newZip = console.promptForString("PLEASE ENTER NEW ZIP CODE: ");
        toEdit.setZip(newZip);

    }
}
