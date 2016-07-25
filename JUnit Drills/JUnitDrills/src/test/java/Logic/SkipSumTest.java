/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class SkipSumTest {

    int a, b, expected, actual;

    public SkipSumTest() {
    }

    public void SkipSumTest1() {
        a = 3;
        b = 4;
        expected = 7;
        SkipSum ss = new SkipSum();
        actual = ss.SkipSum(a, b);
        Assert.assertEquals(expected, actual);

    }
       public void SkipSumTest2() {
        a = 9;
        b = 4;
        expected = 20;
        SkipSum ss = new SkipSum();
        actual = ss.SkipSum(a, b);
        Assert.assertEquals(expected, actual);

    }
          public void SkipSumTest3() {
        a = 10;
        b = 11;
        expected = 21;
        SkipSum ss = new SkipSum();
        actual = ss.SkipSum(a, b);
        Assert.assertEquals(expected, actual);

    }
}
