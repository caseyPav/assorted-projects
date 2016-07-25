/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbookv2.dao;

import com.sg.addressbookv2.dao.AddressBookUtils;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class nameFormatterTest {

    String input, expected, actual;

    public nameFormatterTest() {
    }

    @Test
    public void nameFormatterTest1() {
        input = "steve";
        expected = "Steve";
        AddressBookUtils u = new AddressBookUtils();
        actual = u.nameFormatter(input);
        Assert.assertEquals(expected, actual);
    }
    
        @Test
    public void nameFormatterTest2() {
        input = "RHONDA";
        expected = "Rhonda";
        AddressBookUtils u = new AddressBookUtils();
        actual = u.nameFormatter(input);
        Assert.assertEquals(expected, actual);
    }
    
            @Test
    public void nameFormatterTest3() {
        input = "lEnOrD";
        expected = "Lenord";
        AddressBookUtils u = new AddressBookUtils();
        actual = u.nameFormatter(input);
        Assert.assertEquals(expected, actual);
    }
    
}
