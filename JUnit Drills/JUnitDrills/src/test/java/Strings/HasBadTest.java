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
public class HasBadTest {

    String str;
    boolean expected, actual;

    public HasBadTest() {
    }

    @Test
    public void HasBadTest1() {
        str = "badxxx";
        expected = true;
        HasBad q = new HasBad();
        actual = q.HasBad(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HasBadTest2() {
        str = "xbadxxx";
        expected = true;
        HasBad q = new HasBad();
        actual = q.HasBad(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void HasBadTest3() {
        str = "xxbadxx";
        expected = false;
        HasBad q = new HasBad();
        actual = q.HasBad(str);
        Assert.assertEquals(expected, actual);
    }

}
