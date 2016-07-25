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
public class SwapLastTest {

    String str, expected, actual;

    public SwapLastTest() {
    }

    @Test
    public void SwapLastTest1() {
        str = "coding";
        expected = "codign";
        SwapLast q = new SwapLast();
        actual = q.SwapLast(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SwapLastTest2() {
        str = "cat";
        expected = "cta";
        SwapLast q = new SwapLast();
        actual = q.SwapLast(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SwapLastTest3() {
        str = "ab";
        expected = "ba";
        SwapLast q = new SwapLast();
        actual = q.SwapLast(str);
        Assert.assertEquals(expected, actual);
    }
}
