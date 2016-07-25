/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbookv2;

import com.sg.addressbookv2.dao.AddressBookIMPL;
import com.sg.addressbookv2.dao.AddressBookUtils;
import com.sg.addressbookv2.dto.Address;
import com.sg.addressbookv2.ui.AddressBookASCII;
import com.sg.addressbookv2.ui.AddressBookUI;
import java.io.IOException;

/**
 *
 * @author apprentice
 */
public class AddressBookController {

    public void run() throws IOException {
        AddressBookUI ui = new AddressBookUI();
        AddressBookIMPL ab = new AddressBookIMPL();
        AddressBookUtils io = new AddressBookUtils();
        AddressBookASCII ascii = new AddressBookASCII();
        ascii.welcome();
        int userSelection = 0;
        while (userSelection != 9) {

            userSelection = ui.displayMenu();

            switch (userSelection) {
                case 1://ADD ADDRESS
                    Address a = ui.add();
                    ab.add(a);
                    ui.changesSaved(io.saveAddressesToFile());
                    break;
                case 2://REMOVE ADDRESS
                    String s = ui.removeUI();
                    String[] temp = s.split("\\s+");
                    ab.remove(temp[0], temp[1]);
                    ui.changesSaved(io.saveAddressesToFile());
                    break;
                case 3://NUMBER OF ENTRIES 
                    ui.sizeOfList(ab.listAll());
                    break;
                case 4://PRINT ALL 
                    ui.listAll(ab.listAll());
                    break;
                case 5://SEARCH BY LAST NAME
                    String r = ui.searchLastNameUI();
                    ui.listAll(ab.getByLastName(r));
                    break;
                case 6://SEARCH BY CITY
                    String q = ui.searchCityUI();
                    ui.listAll(ab.getByCity(q));
                    break;
                case 7://SEARCH BY STATE//sort by city
                    String w = ui.searchByStateUI();
                    ui.listAll(ab.getByState(w));
                    break;
                case 8://SEARCH BY ZIP
                    String zip = ui.searchByZipUI();
                    ui.listAll(ab.getByZip(zip));
                    break;

                default:
                    return;
            }
        }
    }

}
