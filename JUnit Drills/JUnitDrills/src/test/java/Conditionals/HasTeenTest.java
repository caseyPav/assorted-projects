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
public class HasTeenTest {

    int a, b, c;
    boolean actual, expected;

    public HasTeenTest() {
    }

    @Test
    public void HasTeenTest1() {
        a = 13;
        b = 20;
        c = 10;
        expected = true;
        Between10and20 btt = new Between10and20();
        actual = btt.Between10and20(a, b);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void HasTeenTest2() {
        a = 20;
        b = 19;
        c = 10;
        expected = true;
        Between10and20 btt = new Between10and20();
        actual = btt.Between10and20(a, b);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void HasTeenTest3() {
        a = 20;
        b = 10;
        c = 12;
        expected = true;
        Between10and20 btt = new Between10and20();
        actual = btt.Between10and20(a, b);
        Assert.assertEquals(expected, actual);

    }
}
