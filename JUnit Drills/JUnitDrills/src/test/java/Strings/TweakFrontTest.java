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
public class TweakFrontTest {

    String str, expected, actual;

    public TweakFrontTest() {
    }

    @Test
    public void TweakFrontTest1() {
        str = "Hello";
        expected = "llo";
        TweakFront q = new TweakFront();
        actual = q.TweakFront(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TweakFrontTest2() {
        str = "away";
        expected = "aay";
        TweakFront q = new TweakFront();
        actual = q.TweakFront(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TweakFrontTest3() {
        str = "abed";
        expected = "abed";
        TweakFront q = new TweakFront();
        actual = q.TweakFront(str);
        Assert.assertEquals(expected, actual);
    }
}
