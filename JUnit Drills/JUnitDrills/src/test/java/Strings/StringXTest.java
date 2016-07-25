/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class StringXTest {

    String str, expected, actual;

    public StringXTest() {
    }

    @Test
    public void StripXTest1() {
        str = "xHix";
        expected = "Hi";
        StripX q = new StripX();
        actual = q.StripX(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void StripXTest2() {
        str = "xHi";
        expected = "Hi";
        StripX q = new StripX();
        actual = q.StripX(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void StripXTest3() {
        str = "Hxix";
        expected = "Hxi";
        StripX q = new StripX();
        actual = q.StripX(str);
        Assert.assertEquals(expected, actual);
    }
}
