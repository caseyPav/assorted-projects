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
public class MissingCharTest {

    String str, expected, actual;
    int n;

    public MissingCharTest() {
    }

    @Test
    public void MissingCharTest1() {
        str = "kitten";
        n = 0;
        expected = "itten";
        MissingChar mc = new MissingChar();
        actual = mc.MissingChar(str, n);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MissingCharTest2() {
        str = "kitten";
        n = 1;
        expected = "ktten";
        MissingChar mc = new MissingChar();
        actual = mc.MissingChar(str, n);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MissingCharTest3() {
        str = "kitten";
        n = 4;
        expected = "kittn";
        MissingChar mc = new MissingChar();
        actual = mc.MissingChar(str, n);
        Assert.assertEquals(expected, actual);
    }
}
