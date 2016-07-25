/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbookv2.dao;

import com.sg.addressbookv2.dao.AddressBookIMPL;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class getByZipTest {

    String zip;
    int expected, actual;

    public getByZipTest() {
    }

    @Test
    public void getByZipTest1() {
        zip = "86605"; //if fails replace with zip from addresses.txt, crtl-f check occurances in file
        expected = 1;
        AddressBookIMPL u = new AddressBookIMPL();
        actual = u.getByZip(zip).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getByCityTest2() {
        zip = "43636"; //if fails replace with zip from addresses.txt, crtl-f check occurances in file
        expected = 1;
        AddressBookIMPL u = new AddressBookIMPL();
        actual = u.getByZip(zip).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getByCityTest3() {
        zip = "96253"; //if fails replace with zip from addresses.txt, crtl-f check occurances in file
        expected = 1;
        AddressBookIMPL u = new AddressBookIMPL();
        actual = u.getByZip(zip).size();
        Assert.assertEquals(expected, actual);
    }
}
