/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class BackAroundTest {

    String expected, actual, str;

    public BackAroundTest() {
    }

    @Test
    public void BackAroundtest1() {
        str = "cat";
        expected = "tcatt";
        BackAround ba = new BackAround();
        actual = ba.BackAround(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void BackAroundtest2() {
        str = "Hello";
        expected = "oHelloo";
        BackAround ba = new BackAround();
        actual = ba.BackAround(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void BackAroundtest3() {
        str = "a";
        expected = "aaa";
        BackAround ba = new BackAround();
        actual = ba.BackAround(str);
        Assert.assertEquals(expected, actual);
    }
}
