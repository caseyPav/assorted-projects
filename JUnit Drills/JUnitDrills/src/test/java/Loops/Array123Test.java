/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class Array123Test {

    int[] numbers;
    boolean expected, actual;

    public Array123Test() {
    }

    @Test
    public void Array123Test1() {
        numbers = new int[]{1, 1, 2, 3, 1};
        expected = true;
        Array123 a = new Array123();
        actual = a.Array123(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Array123Test2() {
        numbers = new int[]{1, 1, 2, 4, 1};
        expected = false;
        Array123 a = new Array123();
        actual = a.Array123(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Array123Test3() {
        numbers = new int[]{1, 1, 2, 1, 2, 3};
        expected = true;
        Array123 a = new Array123();
        actual = a.Array123(numbers);
        Assert.assertEquals(expected, actual);
    }
}
