package com.sg.addressbookv2.ui;

import com.sg.addressbookv2.dao.AddressBookUtils;
import com.sg.addressbookv2.dto.Address;
import java.util.List;
  
public class AddressBookUI {

    AddressBookUtils utils = new AddressBookUtils();
    ConsoleIO console = new ConsoleIO();

    //MAIN MENU    
    public int displayMenu() {

        console.promptForPrintPrompt("                          ==============================");
        console.promptForPrintPrompt("                          |      ADDRESS BOOK MENU     |");
        console.promptForPrintPrompt("                          |============================|");
        console.promptForPrintPrompt("                          |============================|");
        console.promptForPrintPrompt("                          || 1.  ADD ADDRESS          ||");
        console.promptForPrintPrompt("                          || 2.  DELETE ADDRESS       ||");
        console.promptForPrintPrompt("                          || 3.  NUMBER OF ENTRIES    ||");
        console.promptForPrintPrompt("                          || 4.  LIST ALL ENTRIES     ||");
        console.promptForPrintPrompt("                          || 5.  SEARCH BY LAST NAME  ||");
        console.promptForPrintPrompt("                          || 6.  SEARCH BY CITY       ||");
        console.promptForPrintPrompt("                          || 7.  SEARCH BY STATE      ||");
        console.promptForPrintPrompt("                          || 8.  SEARCH BY ZIPCODE    ||");
        console.promptForPrintPrompt("                          || 9.  QUIT                 ||");
        console.promptForPrintPrompt("                          ==============================");

        return console.promptForIntWithRange("                            PLEASE MAKE A SELECTION: ", 1, 9);
    }

    //UI for add address
    public Address add() {
        console.promptForPrintPrompt("                    ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                    + PLEASE ENTER INFORMATION FOR A NEW ENTRY +");
        console.promptForPrintPrompt("                    ++++++++++++++++++++++++++++++++++++++++++++");
        console.promptForString("");
        String firstName = console.promptForString("          FIRST NAME: ");
        String lastName = console.promptForString("          LAST NAME: ");
        String street = console.promptForString("          STREET: ");
        String city = console.promptForString("          CITY: ");
        String state = console.promptForString("          STATE: ");
        String zip = console.promptForString("          ZIPCODE: ");

        Address add = new Address(utils.nameFormatter(firstName), utils.nameFormatter(lastName), street, city, state, zip);

        return add;
    }

    //UI for remove
    public String removeUI() {
        console.promptForPrintPrompt("                    +++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                    + PLEASE ENTER NAME TO REMOVE +");
        console.promptForPrintPrompt("                    +++++++++++++++++++++++++++++++");
        console.promptForString("");
        String firstName = console.promptForString("          FIRST NAME: ");
        String lastName = console.promptForString("          LAST NAME: ");
        String temp = firstName + " " + lastName;
        return temp;
    }

    //UI for # of titles in Library
    public void sizeOfList(List<Address> AddressList) {
        console.promptForString("");
        int size = AddressList.size();
        console.promptForPrintPrompt("                    +++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                    + CURRENT NUMBER OF ENTRIES:  +");
        console.promptForPrintPrompt("                          ");
        console.promptForPrintInt(size);
        console.promptForPrintPrompt("\n                    +++++++++++++++++++++++++++++++");
    }

    //UI for list all 
    public void listAll(List<Address> AddressList) {
        for (Address a : AddressList) {
            console.promptForPrintPrompt(a.toString());
        }
    }

    //UI for search last name 
    public String searchLastNameUI() {
        console.promptForPrintPrompt("                    +++++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                    + PLEASE ENTER LAST NAME TO SEARCH BY +");
        console.promptForPrintPrompt("                    +++++++++++++++++++++++++++++++++++++++");
        console.promptForString("");
        String lastName = console.promptForString("          LAST NAME: ");
        return lastName;
    }

    //UI for search city
    public String searchCityUI() {
        console.promptForPrintPrompt("                    ++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                    + PLEASE ENTER CITY TO SEARCH BY +");
        console.promptForPrintPrompt("                    ++++++++++++++++++++++++++++++++++");
        console.promptForString("");
        String city = console.promptForString("          CITY NAME: ");
        return city;
    }

    //UI for search state
    public String searchByStateUI() {
        console.promptForPrintPrompt("                    +++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                    + PLEASE ENTER STATE TO SEARCH BY +");
        console.promptForPrintPrompt("                    +++++++++++++++++++++++++++++++++++");
        console.promptForString("");
        String state = console.promptForString("          STATE: ");
        return state;
    }

    //UI for search zip
    public String searchByZipUI() {
        console.promptForPrintPrompt("                    +++++++++++++++++++++++++++++++++++++");
        console.promptForPrintPrompt("                    + PLEASE ENTER ZIPCODE TO SEARCH BY +");
        console.promptForPrintPrompt("                    +++++++++++++++++++++++++++++++++++++");
        console.promptForString("");
        String zip = console.promptForString("          ZIPCODE: ");
        return zip;
    }

    //UI for changes saved to file
    public void changesSaved(boolean saveWorked) {
        if (saveWorked == true) {
            console.promptForPrintPrompt("                    ++++++++++++++++++++++++++++++++++++++++");
            console.promptForPrintPrompt("                    +++++++   CHANGES SAVED TO FILE  +++++++");
            console.promptForPrintPrompt("                    ++++++++++++++++++++++++++++++++++++++++");
        } else {
            console.promptForPrintPrompt("                    ++++++++++++++++++++++++++");
            console.promptForPrintPrompt("                    +     shhh bby is ok     +");
            console.promptForPrintPrompt("                    +========================+");
            console.promptForPrintPrompt("                    +   something is broke   +");
            console.promptForPrintPrompt("                    + unable to save to file +");
            console.promptForPrintPrompt("                    ++++++++++++++++++++++++++");
        }
    }
}
