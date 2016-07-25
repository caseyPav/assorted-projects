/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class Unluck1Test {

    int[] numbers;
    boolean expected, actual;

    public Unluck1Test() {
    }

    @Test
    public void Unlucky1Test1() {
        numbers = new int[]{1, 3, 4, 5};
        expected = true;
        Unlucky1 u = new Unlucky1();
        actual = u.Unlucky1(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Unlucky1Test2() {
        numbers = new int[]{2, 1, 3, 4, 5};
        expected = true;
        Unlucky1 u = new Unlucky1();
        actual = u.Unlucky1(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Unlucky1Test3() {
        numbers = new int[]{1, 1, 1};
        expected = false;
        Unlucky1 u = new Unlucky1();
        actual = u.Unlucky1(numbers);
        Assert.assertEquals(expected, actual);
    }

}
