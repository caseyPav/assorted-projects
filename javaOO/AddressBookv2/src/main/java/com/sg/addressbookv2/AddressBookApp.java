/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbookv2;

import java.io.IOException;

/**
 *
 * @author apprentice
 */
public class AddressBookApp {
    public static void main(String[] args) throws IOException {
        AddressBookController abc = new AddressBookController();
        abc.run();
    }
}
