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
public class removeTest {

    int expected, actual;

    public removeTest() {
    }

    @Test
    public void removeTest1() {
        Address a = new Address("test", "test", "test", "test", "OH", "test");
        expected = 300;
        AddressBookIMPL u = new AddressBookIMPL();
        u.add(a);
        u.remove("test", "test");
        actual = u.listAll().size();
        Assert.assertEquals(expected, actual);
    }
}
