/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class NotStringTest {

    String s, expected, actual;

    public NotStringTest() {
    }

    @Test
    public void NotStringTest1() {
        s = "candy";
        expected = "not candy";
        NotString ns = new NotString();
        actual = ns.NotString(s);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void NotStringTest2() {
        s = "x";
        expected = "not x";
        NotString ns = new NotString();
        actual = ns.NotString(s);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void NotStringTest3() {
        s = "not bad";
        expected = "not bad";
        NotString ns = new NotString();
        actual = ns.NotString(s);
        Assert.assertEquals(expected, actual);
    }
}
