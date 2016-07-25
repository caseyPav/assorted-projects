/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class EveryNthTest {

    String str, expected, actual;
    int n;

    public EveryNthTest() {
    }

    @Test
    public void EveryNthTest1() {
        str = "Miracle";
        n = 2;
        expected = "Mrce";
        EveryNth en = new EveryNth();
        actual = en.EveryNth(str, n);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EveryNthTest2() {
        str = "abcdefg";
        n = 2;
        expected = "aceg";
        EveryNth en = new EveryNth();
        actual = en.EveryNth(str, n);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EveryNthTest3() {
        str = "abcdefg";
        n = 3;
        expected = "adg";
        EveryNth en = new EveryNth();
        actual = en.EveryNth(str, n);
        Assert.assertEquals(expected, actual);
    }
}
