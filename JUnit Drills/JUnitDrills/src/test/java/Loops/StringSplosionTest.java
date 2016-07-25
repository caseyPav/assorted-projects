/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class StringSplosionTest {

    String str, expected, actual;

    public StringSplosionTest() {
    }

    @Test
    public void StringSplosionTest1() {
        str = "Code";
        expected = "CCoCodCode";
        StringSplosion sh = new StringSplosion();
        actual = sh.StringSplosion(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void StringSplosionTest2() {
        str = "abc";
        expected = "aababc";
        StringSplosion sh = new StringSplosion();
        actual = sh.StringSplosion(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void StringSplosionTest3() {
        str = "ab";
        expected = "aab";
        StringSplosion sh = new StringSplosion();
        actual = sh.StringSplosion(str);
        Assert.assertEquals(expected, actual);
    }
}
