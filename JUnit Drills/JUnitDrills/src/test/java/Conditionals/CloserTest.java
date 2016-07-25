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
public class CloserTest {

    int a, b, expected, actual;

    public CloserTest() {
    }

    @Test
    public void CloserTest1() {
        a = 8;
        b = 13;
        expected = 0;
        Closer c = new Closer();
        actual = c.Closer(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CloserTest2() {
        a = 13;
        b = 8;
        expected = 0;
        Closer c = new Closer();
        actual = c.Closer(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CloserTest3() {
        a = 7;
        b = 13;
        expected = 0;
        Closer c = new Closer();
        actual = c.Closer(a, b);
        Assert.assertEquals(expected, actual);
    }
}
