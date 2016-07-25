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
public class LastCharsTest {

    String a, b, expected, actual;

    public LastCharsTest() {
    }

    @Test
    public void LastCharsTest1() {
        a = "last";
        b = "chars";
        expected = "ls";
        LastChars q = new LastChars();
        actual = q.LastChars(a, b);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void LastCharsTest2() {
        a = "yo";
        b = "mama";
        expected = "ya";
        LastChars q = new LastChars();
        actual = q.LastChars(a, b);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void LastCharsTest3() {
        a = "hi";
        b = " ";
        expected = "h@";
        LastChars q = new LastChars();
        actual = q.LastChars(a, b);
        Assert.assertEquals(expected, actual);
    }
}
