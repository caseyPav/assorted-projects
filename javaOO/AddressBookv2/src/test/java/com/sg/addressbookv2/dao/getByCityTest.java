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
public class getByCityTest {

    String city;
    int expected, actual;

    public getByCityTest() {
    }

    @Test
    public void getByCityTest1() {
        city = "Kearney"; //if fails replace with city from addresses.txt, crtl-f check occurances in file
        expected = 4;
        AddressBookIMPL u = new AddressBookIMPL();
        actual = u.getByCity(city).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getByCityTest2() {
        city = "Lafayette"; //if fails replace with city from addresses.txt, crtl-f check occurances in file
        expected = 4;
        AddressBookIMPL u = new AddressBookIMPL();
        actual = u.getByCity(city).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getByCityTest3() {
        city = "Bozeman"; //if fails replace with city from addresses.txt, crtl-f check occurances in file
        expected = 2;
        AddressBookIMPL u = new AddressBookIMPL();
        actual = u.getByCity(city).size();
        Assert.assertEquals(expected, actual);
    }
}
