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
public class getByLastNameTest {

    String name;
    int expected, actual;

    public getByLastNameTest() {
    }

    @Test
    public void getByLastNameTest1() {
        name = "Trevino"; //if fails replace with name from addresses.txt!!!!!!!!
        expected = 1;
        AddressBookIMPL u = new AddressBookIMPL();
        actual = u.getByLastName(name).size();
        Assert.assertEquals(expected, actual);
    }
}
