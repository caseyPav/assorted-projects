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
public class StringXTest {

    String str, expected, actual;

    public StringXTest() {
    }

    @Test
    public void StringXTest1() {
        str = "xxHxix";
        expected = "xHix";
        StringX sh = new StringX();
        actual = sh.StringX(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void StringXTest2() {
        str = "abxxxcd";
        expected = "abcd";
        StringX sh = new StringX();
        actual = sh.StringX(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void StringXTest3() {
        str = "xabxxxcdx";
        expected = "xabcdx";
        StringX sh = new StringX();
        actual = sh.StringX(str);
        Assert.assertEquals(expected, actual);
    }

}
