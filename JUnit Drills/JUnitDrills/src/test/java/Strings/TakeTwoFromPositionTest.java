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
public class TakeTwoFromPositionTest {

    String str, expected, actual;
    int n;

    public TakeTwoFromPositionTest() {
    }

    @Test
    public void TakeTwoFromPositionTest1() {
        str = "java";
        n = 0;
        expected = "ja";
        TakeTwoFromPosition q = new TakeTwoFromPosition();
        actual = q.TakeTwoFromPosition(str, n);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TakeTwoFromPositionTest2() {
        str = "java";
        n = 2;
        expected = "ja";
        TakeTwoFromPosition q = new TakeTwoFromPosition();
        actual = q.TakeTwoFromPosition(str, n);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TakeTwoFromPositionTest3() {
        str = "java";
        n = 2;
        expected = "ja";
        TakeTwoFromPosition q = new TakeTwoFromPosition();
        actual = q.TakeTwoFromPosition(str, n);
        Assert.assertEquals(expected, actual);
    }
}
