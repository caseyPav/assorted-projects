/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class FrontAndBackTest {

    String str, expected, actual;
    int n;

    public FrontAndBackTest() {
    }

    @Test
    public void FrontAndBackTest1() {
        str = "Hello";
        n = 2;
        expected = "Helo";
        FrontAndBack q = new FrontAndBack();
        actual = q.FrontAndBack(str, n);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FrontAndBackTest2() {
        str = "Choclate";
        n = 3;
        expected = "Choate";
        FrontAndBack q = new FrontAndBack();
        actual = q.FrontAndBack(str, n);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FrontAndBackTest3() {
        str = "Choclate";
        n = 1;
        expected = "Ce";
        FrontAndBack q = new FrontAndBack();
        actual = q.FrontAndBack(str, n);
        Assert.assertEquals(expected, actual);
    }
}
