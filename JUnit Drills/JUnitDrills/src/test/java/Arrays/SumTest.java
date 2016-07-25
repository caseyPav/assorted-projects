/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class SumTest {

    int expected, actual;
    int[] numbers;

    public SumTest() {
    }

    @Test
    public void SumTest6() {
        numbers = new int[]{1, 2, 3};
        expected = 6;
        Sum sum = new Sum();
        actual = sum.Sum(numbers);
        org.junit.Assert.assertEquals(expected, actual);

    }
        @Test
    public void SumTest18() {
        numbers = new int[]{5, 11, 2};
        expected = 18;
        Sum sum = new Sum();
        actual = sum.Sum(numbers);
        org.junit.Assert.assertEquals(expected, actual);

    }
        @Test
    public void SumTest7() {
        numbers = new int[]{7, 0, 0};
        expected = 7;
        Sum sum = new Sum();
        actual = sum.Sum(numbers);
        org.junit.Assert.assertEquals(expected, actual);

    }
}
