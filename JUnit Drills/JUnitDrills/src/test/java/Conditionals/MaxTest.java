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
public class MaxTest {

    int a, b, c, expected, actual;

    public MaxTest() {
    }

    @Test
    public void MaxTest1() {
        a = 1;
        b = 2;
        c = 3;
        expected = 2;
        Max m = new Max();
        actual = m.Max(a, b, c);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MaxTest2() {
        a = 1;
        b = 3;
        c = 2;
        expected = 3;
        Max m = new Max();
        actual = m.Max(a, b, c);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MaxTest3() {
        a = 3;
        b = 2;
        c = 1;
        expected = 3;
        Max m = new Max();
        actual = m.Max(a, b, c);
        Assert.assertEquals(expected, actual);
    }
}
