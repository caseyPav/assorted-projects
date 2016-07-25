/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import Strings.SayHi;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class CountXXTest {

    String str;
    int expected, actual;

    public CountXXTest() {
    }

    @Test
    public void CountXXTest1() {
        str = "abcxx";
        expected = 1;
        CountXX sh = new CountXX();
        actual = sh.CountXX(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CountXXTest2() {
        str = "xxx";
        expected = 1;
        CountXX sh = new CountXX();
        actual = sh.CountXX(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CountXXTest3() {
        str = "xxxx";
        expected = 2;
        CountXX sh = new CountXX();
        actual = sh.CountXX(str);
        Assert.assertEquals(expected, actual);
    }
}
