/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class Make2Test {

    int[] a, b, expected, actual;

    public Make2Test() {
    }

    @Test
    public void MakeTwo1() {
        a = new int[]{4, 5};
        b = new int[]{1, 2, 3};
        expected = new int[]{4, 5};
        Make2 f = new Make2();
        actual = f.make2(a, b);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void MakeTwo2() {
        a = new int[]{4};
        b = new int[]{1, 2, 3};
        expected = new int[]{4, 1};
        Make2 f = new Make2();
        actual = f.make2(a, b);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void MakeTwo3() {
        a = new int[]{};
        b = new int[]{1, 2};
        expected = new int[]{1, 2};
        Make2 f = new Make2();
        actual = f.make2(a, b);
        Assert.assertArrayEquals(expected, actual);
    }
}
