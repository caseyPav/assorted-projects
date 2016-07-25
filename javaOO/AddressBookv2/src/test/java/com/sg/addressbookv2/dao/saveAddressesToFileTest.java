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
public class saveAddressesToFileTest {

    boolean expected, actual;

    public saveAddressesToFileTest() {
    }

    @Test
    public void saveAddressesToFileTest1() {
        expected = true;
        AddressBookUtils u = new AddressBookUtils();
        actual = u.saveAddressesToFile();
        Assert.assertEquals(expected, actual);
    }
}
