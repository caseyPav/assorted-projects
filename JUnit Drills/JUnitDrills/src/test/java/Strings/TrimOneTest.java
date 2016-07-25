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
public class TrimOneTest {

    String str, expected, actual;

    public TrimOneTest() {
    }

    @Test
    public void TrimOneTest1() {
        str = "Hello";
        expected = "ell";
        TrimOne q = new TrimOne();
        actual = q.TrimOne(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TrimOneTest2() {
        str = "java";
        expected = "av";
        TrimOne q = new TrimOne();
        actual = q.TrimOne(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TrimOneTest3() {
        str = "coding";
        expected = "odin";
        TrimOne q = new TrimOne();
        actual = q.TrimOne(str);
        Assert.assertEquals(expected, actual);
    }
}
