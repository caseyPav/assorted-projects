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
public class RotateLeft2Test {

    String str, expected, actual;

    public RotateLeft2Test() {
    }

    @Test
    public void RotateLeft2Test1() {
        str = "Hello";
        expected = "lloHe";
        RotateLeft2 q = new RotateLeft2();
        actual = q.Rotateleft2(str);
        Assert.assertEquals(expected, actual);
    }
     @Test
    public void RotateLeft2Test2() {
        str = "java";
        expected = "vaja";
        RotateLeft2 q = new RotateLeft2();
        actual = q.Rotateleft2(str);
        Assert.assertEquals(expected, actual);
    }
     @Test
    public void RotateLeft2Test3() {
        str = "Hi";
        expected = "Hi";
        RotateLeft2 q = new RotateLeft2();
        actual = q.Rotateleft2(str);
        Assert.assertEquals(expected, actual);
    }
}
