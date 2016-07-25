/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbookv2.dao;

import com.sg.addressbookv2.dao.AddressBookUtils;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class readInAddressTest {

    int expected, actual;

    public readInAddressTest() {
    }

    @Test
    public void readInAddressTest1() {
        expected = 300;
        //if test returns fails make sure this number matches the number of lines in addresses.txt!!!!!!!!
        AddressBookUtils u = new AddressBookUtils();
        actual = u.readInAddress().size();
        Assert.assertEquals(expected, actual);
    }
}
