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
public class LongInMiddleTest {

    String a, b, expected, actual;

    public LongInMiddleTest() {
    }

    @Test
    public void LongInMiddleTest1() {
        a = "Hello";
        b = "hi";
        expected = "hiHellohi";
        LongInMiddle q = new LongInMiddle();
        actual = q.LongInMiddle(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void LongInMiddleTest2() {
        b = "Hello";
        a = "hi";
        expected = "hiHellohi";
        LongInMiddle q = new LongInMiddle();
        actual = q.LongInMiddle(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void LongInMiddleTest3() {
        a = "aaa";
        b = "b";
        expected = "baaab";
        LongInMiddle q = new LongInMiddle();
        actual = q.LongInMiddle(a, b);
        Assert.assertEquals(expected, actual);
    }
}
