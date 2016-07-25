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
public class readInStatesTest {

    int expected, actual;

    public readInStatesTest() {
    }

    @Test
    public void readInStatesTest1() {
        expected = 50;
        AddressBookUtils u = new AddressBookUtils();
        actual = u.readInStates().size();
        Assert.assertEquals(expected, actual);
    }

}
