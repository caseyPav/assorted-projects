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
public class ArrayFront9Test {
        int expected, actual;
    int[] numbers;
    public ArrayFront9Test() {
    }

    @Test
    public void ArrayFront9Test1() {
        numbers = new int[]{1, 2, 9, 3, 4};
        expected = 0;
        ArrayFront9 cn = new ArrayFront9();
        actual = cn.ArrayFront9(numbers);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void ArrayFront9Test2() {
        numbers = new int[]{1, 2, 3, 4, 9};
        expected = 0;
        ArrayFront9 cn = new ArrayFront9();
        actual = cn.ArrayFront9(numbers);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void ArrayFront9Test3() {
        numbers = new int[]{1, 2, 3, 4, 5};
        expected = 0;
        ArrayFront9 cn = new ArrayFront9();
        actual = cn.ArrayFront9(numbers);
        Assert.assertEquals(expected, actual);
    }
}
