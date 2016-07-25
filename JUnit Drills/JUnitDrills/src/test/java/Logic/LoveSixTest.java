/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

/**
 *
 * @author apprentice
 */
public class LoveSixTest {

    int a, b;
    boolean expected, actual;

    public LoveSixTest() {
    }

    @Test
    public void LovesixTest1() {
        a = 6;
        b = 4;
        expected = true;
        LoveSix ls = new LoveSix();
        actual = ls.LoveSix(a, b);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void LovesixTest2() {
        a = 4;
        b = 5;
        expected = false;
        LoveSix ls = new LoveSix();
        actual = ls.LoveSix(a, b);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void LovesixTest3() {
        a = 1;
        b = 5;
        expected = true;
        LoveSix ls = new LoveSix();
        actual = ls.LoveSix(a, b);
        Assert.assertEquals(expected, actual);

    }
}
