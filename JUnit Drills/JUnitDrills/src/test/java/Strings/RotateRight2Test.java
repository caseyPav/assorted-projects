/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class RotateRight2Test {

    String str, expected, actual;

    public RotateRight2Test() {
    }

    @Test
    public void RotateRight2Test1() {
        str = "Hello";
        expected = "loHel";
        RotateRight2 q = new RotateRight2();
        actual = q.Rotateleft2(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RotateRight2Test2() {
        str = "java";
        expected = "vaja";
        RotateRight2 q = new RotateRight2();
        actual = q.Rotateleft2(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RotateRight2Test3() {
        str = "Hi";
        expected = "Hi";
        RotateRight2 q = new RotateRight2();
        actual = q.Rotateleft2(str);
        Assert.assertEquals(expected, actual);
    }
}
