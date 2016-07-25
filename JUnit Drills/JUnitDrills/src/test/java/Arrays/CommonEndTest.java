/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import org.junit.Test;

/**
 * * Given 2 arrays of ints, a and b, return true if they have the same first
 * element or they have the same last element. Both arrays will be length 1 or
 * more. * CommonEnd({1, 2, 3}, {7, 3}) -> true CommonEnd({1, 2, 3}, {7, 3, 2})
 * -> false CommonEnd({1, 2, 3}, {1, 3}) -> true
 *
 * @author apprentice
 */
public class CommonEndTest {

    int[] a;
    int[] b;
    boolean expected, actual;

    public CommonEndTest() {
    }

    @Test
    public void CommonEndTestTrue1() {
        a = new int[]{1, 2, 3};
        b = new int[]{7, 3};
        expected = true;
        CommonEnd ce = new CommonEnd();
        actual = ce.commonEnd(a, b);
        
        org.junit.Assert.assertEquals(expected, actual);

    }
        @Test
    public void CommonEndTestFalse1() {
        a = new int[]{1, 2, 3};
        b = new int[]{7, 3, 2};
        expected = false;
        CommonEnd ce = new CommonEnd();
        actual = ce.commonEnd(a, b);
        
        org.junit.Assert.assertEquals(expected, actual);

    }
            @Test
    public void CommonEndTestTrue2() {
        a = new int[]{1, 2, 3};
        b = new int[]{1, 3};
        expected = true;
        CommonEnd ce = new CommonEnd();
        actual = ce.commonEnd(a, b);
        
        org.junit.Assert.assertEquals(expected, actual);

    }
}
