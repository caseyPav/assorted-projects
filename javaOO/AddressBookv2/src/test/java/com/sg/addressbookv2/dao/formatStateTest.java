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
public class formatStateTest {

    String input, expected, actual;

    public formatStateTest() {
    }

    @Test
    public void formatStateTest1() {
        input = "ohio";
        expected = "OH";
        AddressBookUtils u = new AddressBookUtils();
        actual = u.formatState(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void formatStateTest2() {
        input = "OHIO";
        expected = "OH";
        AddressBookUtils u = new AddressBookUtils();
        actual = u.formatState(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void formatStateTest3() {
        input = "oh";
        expected = "OH";
        AddressBookUtils u = new AddressBookUtils();
        actual = u.formatState(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void formatStateTest4() {
        input = "OH";
        expected = "OH";
        AddressBookUtils u = new AddressBookUtils();
        actual = u.formatState(input);
        Assert.assertEquals(expected, actual);
    }

}
