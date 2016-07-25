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
public class getByStateTest {

    String state;
    int expected, actual;

    public getByStateTest() {
    }

    @Test
    public void getByStateTest1() {
        state = "ohio"; //if fails replace with state from addresses.txt, crtl-f check occurances in file
        expected = 7;
        AddressBookIMPL u = new AddressBookIMPL();
        actual = u.getByState(state).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getByStateTest2() {
        state = "oh"; //if fails replace with state from addresses.txt, crtl-f check occurances in file
        expected = 7;
        AddressBookIMPL u = new AddressBookIMPL();
        actual = u.getByState(state).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getByStateTest3() {
        state = "Ohio"; //if fails replace with state from addresses.txt, crtl-f check occurances in file
        expected = 7;
        AddressBookIMPL u = new AddressBookIMPL();
        actual = u.getByState(state).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getByStateTest4() {
        state = "OH"; //if fails replace with state from addresses.txt, crtl-f check occurances in file
        expected = 7;
        AddressBookIMPL u = new AddressBookIMPL();
        actual = u.getByState(state).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getByStateTest5() {
        state = "OHIO"; //if fails replace with state from addresses.txt, crtl-f check occurances in file
        expected = 7;
        AddressBookIMPL u = new AddressBookIMPL();
        actual = u.getByState(state).size();
        Assert.assertEquals(expected, actual);
    }

}
