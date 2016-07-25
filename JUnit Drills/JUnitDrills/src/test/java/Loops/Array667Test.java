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
public class Array667Test {

    int[] numbers;
    int expected, actual;

    public Array667Test() {
    }

    @Test
    public void Array667Test1() {
        numbers = new int[]{6, 6, 2};
        expected = 1;
        Array667 sh = new Array667();
        actual = sh.Array667(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Array667Test2() {
        numbers = new int[]{6, 6, 2, 6};
        expected = 1;
        Array667 sh = new Array667();
        actual = sh.Array667(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Array667Test3() {
        numbers = new int[]{6, 7, 2, 6};
        expected = 1;
        Array667 sh = new Array667();
        actual = sh.Array667(numbers);
        Assert.assertEquals(expected, actual);
    }

}
