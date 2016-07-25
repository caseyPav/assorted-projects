/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbookv2.dao;

import com.sg.addressbookv2.dao.AddressBookIMPL;
import com.sg.addressbookv2.dto.Address;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class addTest {

    int expected, actual;

    public addTest() {
    }

    @Test
    public void addTest1() {
        Address a = new Address("test", "test", "test", "test", "OH", "test");
        expected = 301;
        AddressBookIMPL u = new AddressBookIMPL();
        u.add(a);
        actual = u.listAll().size();
        u.remove("test", "test");
        Assert.assertEquals(expected, actual);
    }
}
