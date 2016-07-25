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
public class MiddleTwoTest {

    String str, expected, actual;

    public MiddleTwoTest() {
    }

    @Test
    public void MiddleTwoTest1() {
        str = "string";
        expected = "ri";
        MiddleTwo q = new MiddleTwo();
        actual = q.MiddleTwo(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MiddleTwoTest2() {
        str = "code";
        expected = "od";
        MiddleTwo q = new MiddleTwo();
        actual = q.MiddleTwo(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MiddleTwoTest3() {
        str = "Practice";
        expected = "ct";
        MiddleTwo q = new MiddleTwo();
        actual = q.MiddleTwo(str);
        Assert.assertEquals(expected, actual);
    }
}
