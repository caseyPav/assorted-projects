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
 * Given an array of ints length 3, return a new array with the elements in
 * reverse order, so for example {1, 2, 3} becomes {3, 2, 1}. * public int[]
 * Reverse(int[] numbers) {
 *
 * }
 *
 * @author apprentice
 */
public class ReverseTest {

    int[] numbers, expected, actual;

    public ReverseTest() {
    }

    @Test
    public void ReverseTest() {
        numbers = new int[]{1, 2, 3};
        expected = new int[]{3, 2, 1};
        Reverse rt = new Reverse();
        actual = rt.Reverse(numbers);

        Assert.assertArrayEquals(expected, actual);

    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
