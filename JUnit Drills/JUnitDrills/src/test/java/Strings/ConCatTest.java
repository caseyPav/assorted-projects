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
public class ConCatTest {

    String a, b, expected, actual;

    public ConCatTest() {
    }

    @Test
    public void ConCatTest1() {
        a = "abc";
        b = "cat";
        expected = "abcat";
        ConCat q = new ConCat();
        actual = q.ConCat(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ConCatTest2() {
        a = "dog";
        b = "cat";
        expected = "dogcat";
        ConCat q = new ConCat();
        actual = q.ConCat(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ConCatTest3() {
        a = "abc";
        b = "";
        expected = "abc";
        ConCat q = new ConCat();
        actual = q.ConCat(a, b);
        Assert.assertEquals(expected, actual);
    }
}
