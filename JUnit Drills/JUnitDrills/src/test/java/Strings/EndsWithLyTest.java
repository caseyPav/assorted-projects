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
public class EndsWithLyTest {

    String str;
    boolean expected, actual;

    public EndsWithLyTest() {
    }

    @Test
    public void EndsWithLyTest1() {
        str = "oddly";
        expected = true;
        EndsWithLy q = new EndsWithLy();
        actual = q.EndsWithLy(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EndsWithLyTest2() {
        str = "y";
        expected = false;
        EndsWithLy q = new EndsWithLy();
        actual = q.EndsWithLy(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EndsWithLyTest3() {
        str = "oddy";
        expected = false;
        EndsWithLy q = new EndsWithLy();
        actual = q.EndsWithLy(str);
        Assert.assertEquals(expected, actual);
    }
}
