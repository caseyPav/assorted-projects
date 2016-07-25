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
public class MultpileEndingsTest {

    String str, expected, actual;

    public MultpileEndingsTest() {
    }

    @Test
    public void MultipleEndingsTest1() {
        str = "Hello";
        expected = "lololo";
        MultipleEndings q = new MultipleEndings();
        actual = q.MultipleEndings(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MultipleEndingsTest2() {
        str = "ab";
        expected = "ababab";
        MultipleEndings q = new MultipleEndings();
        actual = q.MultipleEndings(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MultipleEndingsTest3() {
        str = "ab";
        expected = "ababab";
        MultipleEndings q = new MultipleEndings();
        actual = q.MultipleEndings(str);
        Assert.assertEquals(expected, actual);
    }
}
