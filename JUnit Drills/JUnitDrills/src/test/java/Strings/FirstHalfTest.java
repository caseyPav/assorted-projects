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
public class FirstHalfTest {

    String str, expected, actual;

    public FirstHalfTest() {
    }

    @Test
    public void FirstHalfTest1() {
        str = "WooHoo";
        expected = "Woo";
        FirstHalf q = new FirstHalf();
        actual = q.FirstHalf(str);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void FirstHalfTest2() {
        str = "HelloThere";
        expected = "Hello";
        FirstHalf q = new FirstHalf();
        actual = q.FirstHalf(str);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void FirstHalfTest3() {
        str = "abcdef";
        expected = "abc";
        FirstHalf q = new FirstHalf();
        actual = q.FirstHalf(str);
        Assert.assertEquals(expected, actual);
    }
}
