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
 * Given an array of ints, return the number of 9's in the array.  *
 * Count9({1, 2, 9}) -> 1 Count9({1, 9, 9}) -> 2 Count9({1, 9, 9, 3, 9}) -> 3
 *
 * @author apprentice
 */
public class Count9Test {

    int expected, actual;
    int[] numbers;

    public Count9Test() {
    }

    @Test
    public void Count9Test1() {
        numbers = new int[]{1, 2, 9};
        expected = 1;
        Count9 cn = new Count9();
        actual = cn.Count9(numbers);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void Count9Test2() {
        numbers = new int[]{1, 9, 9};
        expected = 2;
        Count9 cn = new Count9();
        actual = cn.Count9(numbers);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void Count9Test3() {
        numbers = new int[]{1, 9, 9, 3, 9};
        expected = 3;
        Count9 cn = new Count9();
        actual = cn.Count9(numbers);
        Assert.assertEquals(expected, actual);
    }
}
