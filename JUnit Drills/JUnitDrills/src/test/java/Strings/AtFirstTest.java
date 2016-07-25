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
public class AtFirstTest {

    String str, expected, actual;

    public AtFirstTest() {
    }

    @Test
    public void AtFirstTest1() {
        str = "hello";
        expected = "he";
        AtFirst q = new AtFirst();
        actual = q.AtFirst(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AtFirstTest2() {
        str = "hi";
        expected = "hi";
        AtFirst q = new AtFirst();
        actual = q.AtFirst(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AtFirstTest3() {
        str = "h";
        expected = "h@";
        AtFirst q = new AtFirst();
        actual = q.AtFirst(str);
        Assert.assertEquals(expected, actual);
    }
}
