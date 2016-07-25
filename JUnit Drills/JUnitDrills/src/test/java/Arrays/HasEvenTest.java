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
public class HasEvenTest {

    int[] numbers;
    boolean expected, actual;

    public HasEvenTest() {

    }

    @Test
    public void HasEvenTest1() {
        numbers = new int[]{2, 5};
        expected = true;
        HasEven he = new HasEven();
        actual = he.HasEven(numbers);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void HasEvenTest2() {
        numbers = new int[]{4, 3};
        expected = true;
        HasEven he = new HasEven();
        actual = he.HasEven(numbers);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void HasEvenTest3() {
        numbers = new int[]{7, 5};
        expected = false;
        HasEven he = new HasEven();
        actual = he.HasEven(numbers);
        Assert.assertEquals(expected, actual);
    }
}
