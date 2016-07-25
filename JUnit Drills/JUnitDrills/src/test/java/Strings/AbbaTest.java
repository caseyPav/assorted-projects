/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class AbbaTest {

    String a, b, expected, actual;

    public AbbaTest() {
    }

    @Test
    public void AbbaTest1() {
        a = "Hi";
        b = "Bye";
        expected = "HiByeByeHi";
        Abba q = new Abba();
        actual = q.Abba(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AbbaTest2() {
        a = "Yo";
        b = "Alice";
        expected = "YoAliceAliceYo";
        Abba q = new Abba();
        actual = q.Abba(a, b);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void AbbaTest3() {
        a = "What";
        b = "Up";
        expected = "WhatUpUpWhat";
        Abba q = new Abba();
        actual = q.Abba(a, b);
        Assert.assertEquals(expected, actual);
    }

}
