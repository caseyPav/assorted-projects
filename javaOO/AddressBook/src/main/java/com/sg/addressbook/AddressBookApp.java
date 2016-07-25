/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbook;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author casey pavelko
 * rest of group: Xin Li & Darian Iczkowski
 */
public class AddressBookApp {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        AddressBookController controller = new AddressBookController();
        controller.run();

    }

}
