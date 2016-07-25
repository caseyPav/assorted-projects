/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class Double23Test {

    int[] numbers;
    boolean expected, actual;

    public Double23Test() {
    }

    @Test
    public void Double23Test1() {
        numbers = new int[]{2, 2, 3};
        expected = true;
        Double23 d = new Double23();
        actual = d.Double23(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Double23Test2() {
        numbers = new int[]{3, 4, 5, 3};
        expected = true;
        Double23 d = new Double23();
        actual = d.Double23(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Double23Test3() {
        numbers = new int[]{2, 3, 2, 2,};
        expected = false;
        Double23 d = new Double23();
        actual = d.Double23(numbers);
        Assert.assertEquals(expected, actual);

    }
}
