/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class NearHundredTest {

    int n;
    boolean expected, actual;

    public NearHundredTest() {
    }

    @Test
    public void NearHundredTest1() {
        n = 103;
        expected = true;
        NearHundred nh = new NearHundred();
        actual = nh.NearHundred(n);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void NearHundredTest2() {
        n = 90;
        expected = true;
        NearHundred nh = new NearHundred();
        actual = nh.NearHundred(n);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void NearHundredTest3() {
        n = 89;
        expected = false;
        NearHundred nh = new NearHundred();
        actual = nh.NearHundred(n);
        Assert.assertEquals(expected, actual);
    }
}
