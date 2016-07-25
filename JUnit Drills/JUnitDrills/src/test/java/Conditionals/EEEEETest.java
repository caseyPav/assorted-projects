/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class EEEEETest {

    boolean actual, expected;
    String str;

    public EEEEETest() {
    }

    @Test
    public void EEEEETest1() {
        str = "Hello";
        expected = true;
        EEEEE e = new EEEEE();
        actual = e.EEEEE(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EEEEETest2() {
        str = "Heelloe";
        expected = true;
        EEEEE e = new EEEEE();
        actual = e.EEEEE(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EEEEETest3() {
        str = "Helleeeeeo";
        expected = false;
        EEEEE e = new EEEEE();
        actual = e.EEEEE(str);
        Assert.assertEquals(expected, actual);
    }
}
