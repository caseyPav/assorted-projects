/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.consoleio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class LogicTest {

    public LogicTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void addTest() {
        int x = 1;
        int y = 1;
        int expected = 2;
        int actual = Logic.add(x, y);
        assertEquals(expected, actual);
    }

    @Test
    public void subtractTest() {
        int x = 3;
        int y = 1;
        int expected = 2;
        int actual = Logic.subtract(x, y);
        assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest() {
        int x = 2;
        int y = 2;
        int expected = 4;
        int actual = Logic.multiply(x, y);
        assertEquals(expected, actual);
    }

    @Test
    public void divideTest() {
        int x = 10;
        int y = 2;
        int expected = 5;
        int actual = Logic.divide(x, y);
        assertEquals(expected, actual);
    }

}
