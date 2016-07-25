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
public class KeepLastTest {

    int[] numbers, expected, actual;

    public KeepLastTest() {

    }

    @Test
    public void KeepLastTest1() {
        numbers = new int[]{4, 5, 6};
        expected = new int[]{0, 0, 0, 0, 0, 2};
        KeepLast kl = new KeepLast();
        actual = kl.KeepLast(numbers);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void KeepLastTest2() {
        numbers = new int[]{1, 2};
        expected = new int[]{0, 0, 0, 1};
        KeepLast kl = new KeepLast();
        actual = kl.KeepLast(numbers);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void KeepLastTest3() {
        numbers = new int[]{3};
        expected = new int[]{0, 0};
        KeepLast kl = new KeepLast();
        actual = kl.KeepLast(numbers);
        Assert.assertArrayEquals(expected, actual);
    }
}
