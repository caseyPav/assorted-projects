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
public class RotateLeftTest {

    int[] numbers, actual, expected;
    int shift;

    public RotateLeftTest() {
    }

    @Test
    public void RotateLeftTest1() {

        // arr
        shift = 1;
        numbers = new int[]{1, 2, 3};
        expected = new int[]{3, 1, 2};
        RotateLeft rl = new RotateLeft();
        // act
        actual = rl.RotateLeft(numbers, shift);

        // assert
        Assert.assertArrayEquals(expected, actual);
    }
        @Test
    public void RotateLeftTest2() {

        // arr
        shift = 1;
        numbers = new int[]{5, 11, 9};
        expected = new int[]{9, 5, 11};
        RotateLeft rl = new RotateLeft();
        // act
        actual = rl.RotateLeft(numbers, shift);

        // assert
        Assert.assertArrayEquals(expected, actual);
    }
        public void RotateLeftTest3() {

        // arr
        shift = 1;
        numbers = new int[]{7, 0, 0};
        expected = new int[]{0, 0, 7};
        RotateLeft rl = new RotateLeft();
        // act
        actual = rl.RotateLeft(numbers, shift);

        // assert
        Assert.assertArrayEquals(expected, actual);
    }

}
