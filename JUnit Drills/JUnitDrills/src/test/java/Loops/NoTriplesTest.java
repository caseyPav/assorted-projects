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
public class NoTriplesTest {

    int[] numbers;
    boolean expected, actual;

    public NoTriplesTest() {
    }

    @Test
    public void NoTriplesTest1() {
        numbers = new int[]{1, 1, 2, 2, 1};
        expected = true;
        NoTriples sh = new NoTriples();
        actual = sh.NoTriples(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void NoTriplesTest2() {
        numbers = new int[]{1, 1, 2, 2, 2, 1};
        expected = false;
        NoTriples sh = new NoTriples();
        actual = sh.NoTriples(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void NoTriplesTest3() {
        numbers = new int[]{1, 1, 1, 2, 2, 2, 1};
        expected = false;
        NoTriples sh = new NoTriples();
        actual = sh.NoTriples(numbers);
        Assert.assertEquals(expected, actual);
    }
}
