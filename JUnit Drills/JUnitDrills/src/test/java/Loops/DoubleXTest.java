/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class DoubleXTest {

    boolean expected, actual;
    String str;

    public DoubleXTest() {
    }

    @Test
    public void DoubleXTest1() {
        str = "axxbb";
        expected = true;
        DoubleX sh = new DoubleX();
        actual = sh.DoubleX(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DoubleXTest2() {
        str = "axaxxax";
        expected = false;
        DoubleX sh = new DoubleX();
        actual = sh.DoubleX(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DoubleXTest3() {
        str = "xxxxx";
        expected = true;
        DoubleX sh = new DoubleX();
        actual = sh.DoubleX(str);
        Assert.assertEquals(expected, actual);
    }
}
