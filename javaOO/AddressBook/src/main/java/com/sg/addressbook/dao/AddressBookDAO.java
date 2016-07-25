/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook.dao;

import com.sg.addressbook.dto.Address;
import com.sg.addressbook.dto.AddressBookList;
import com.sg.addressbook.ui.AddressBookUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author apprentice
 */
public class AddressBookDAO {

    AddressBookUI ui = new AddressBookUI();

    //method to read in addresses from file 
    public AddressBookList readInAddress() throws IOException {
        AddressBookList abl = new AddressBookList();
        try (BufferedReader br = new BufferedReader(new FileReader("Addresses.txt"))) {
            String fileRead = br.readLine();
            while (fileRead != null) {
                String[] tokenize = fileRead.split("::");
                String firstName = tokenize[0];
                String lastName = tokenize[1];
                String street = tokenize[2];
                String city = tokenize[3];
                String state = tokenize[4];
                String zip = tokenize[5];
                Address temp = new Address(firstName, lastName, street, city, state, zip);
                abl.addressList.add(temp);
                fileRead = br.readLine();
            }
        }
        return abl;
    }

    //method to save addresses added to file
    public void saveAddressesToFile(AddressBookList abl) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("Addresses.txt"));
        for (Address a : abl.addressList) {
        pw.write(a.toString() + "\n");
        }
       pw.close();
    }

    //method to add address//pass address object
    public boolean addName(AddressBookList abl, Address update) {
        abl.addressList.add(update);
        return true;

    }

    //method to remove address
    public boolean removeName(AddressBookList abl, String removeName) {
        Address temp = null;
        for (Address a : abl.addressList) {
            if (a.getLastName() != null && a.getLastName().contains(removeName)) {
                //addressBookList.addressList.remove(a);
                temp = a;
            }
        }
        abl.addressList.remove(temp);

        return true;
    }

    //method to find 
    public Address findLastName(AddressBookList abl, String findLastName) {
        Address temp = null;
        for (Address a : abl.addressList) {
            if (a.getLastName() != null && a.getLastName().contains(findLastName)) {

                temp = a;
            }

        }
        return temp;
    }

    //method to list total count
    public int listSize(AddressBookList abl) {

        int size = abl.addressList.size();
        System.out.println("NUMBER OF ENTRIES: " + size);
        return size;
    }

    //method to list all
    //only a for loop with a printer. Moved to UI where it belongs.
//method to edit
    public Address editByFindLastName(AddressBookList abl, String findLastName) {
        Address temp = null;
        for (Address a : abl.addressList) {
            if (a.getLastName() != null && a.getLastName().contains(findLastName)) {

                temp = a;
            }

        }
        return temp;
    }

//ui for now...
}
