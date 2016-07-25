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
public class Pattern51Test {
        int[] numbers;
    boolean expected, actual;
    public Pattern51Test() {
    }

    @Test
    public void Pattern51Test1() {
        numbers = new int[]{1, 2, 7, 1};
        expected = true;
        Pattern51 sh = new Pattern51();
        actual = sh.Pattern51(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Pattern51Test2() {
        numbers = new int[]{1, 2, 8, 1};
        expected = false;
        Pattern51 sh = new Pattern51();
        actual = sh.Pattern51(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void NoTriplesTest3() {
        numbers = new int[]{2, 7, 1};
        expected = true;
        Pattern51 sh = new Pattern51();
        actual = sh.Pattern51(numbers);
        Assert.assertEquals(expected, actual);
    }
}
