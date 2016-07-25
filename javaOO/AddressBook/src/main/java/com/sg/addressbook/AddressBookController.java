/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook;

import com.sg.addressbook.dao.AddressBookDAO;
import com.sg.addressbook.dto.Address;
import com.sg.addressbook.dto.AddressBookList;
import com.sg.addressbook.ui.AddressBookUI;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author apprentice
 */
public class AddressBookController {

    public void run() throws FileNotFoundException, IOException {
        //create 
        AddressBookUI ui = new AddressBookUI();
        AddressBookDAO dao = new AddressBookDAO();
        AddressBookList workingList =  dao.readInAddress();
  
        //main program control loop
        int userSelection = 0;
        while (userSelection != 7) {
             //workingList.mayWork(workingList);
            userSelection = ui.displayMenu();
            OUTER:
            switch (userSelection) {
                case 1:
                    //Add address
                    Address a = ui.add();
                    dao.addName(workingList, a);
                    dao.saveAddressesToFile(workingList);
                    break;
                case 2:
                    //remove address
                    String s = ui.remove();
                    dao.removeName(workingList, s);
                    break;
                case 3:
                    //find address
                    String d = ui.findLastName();
                    Address f = dao.findLastName(workingList, d);
                    ui.printFindLastName(f);

                    break;
                case 4:
                    //list size
                    ui.size(workingList);

                    break;
                case 5:
                    //list all addresses
                    ui.listAll(workingList);
                    break;
                case 6:
                    String g = ui.findLastName();
                    Address h = dao.editByFindLastName(workingList, g);
                    int j = ui.printEditAddress(h);
                    //switch statement to select field to edit, passes the selected address object along...
                    switch (j) {
                        case 1:
                            ui.editFirstName(h);
                            break;
                        case 2:
                            ui.editLastName(h);
                            break;
                        case 3:
                            ui.editStreet(h);
                            break;
                        case 4:
                            ui.editCity(h);
                            break;
                        case 5:
                            ui.editState(h);
                            break;
                        case 6:
                            ui.editZip(h);
                            break;
                        case 7:
                            break OUTER;
                        default:
                            break;
                    }

                default:
                    
                    return;
            }
        }
        dao.saveAddressesToFile(workingList);
        System.out.println("saved");
    }

}
