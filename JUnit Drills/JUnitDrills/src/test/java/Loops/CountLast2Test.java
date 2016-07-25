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
public class CountLast2Test {
    String str;
    int expected, actual;
    public CountLast2Test() {
    }

        @Test
    public void CountLast2Test1() {
        str = "hixxhi";
        expected = 1;
        CountLast2 sh = new CountLast2();
        actual = sh.CountLast2(str);
        Assert.assertEquals(expected, actual);
    }
            @Test
    public void CountLast2Test2() {
        str = "xaxxaxaxx";
        expected = 1;
        CountLast2 sh = new CountLast2();
        actual = sh.CountLast2(str);
        Assert.assertEquals(expected, actual);
    }
             @Test
    public void CountLast2Test3() {
        str = "axxxxaaxx";
        expected = 2;
        CountLast2 sh = new CountLast2();
        actual = sh.CountLast2(str);
        Assert.assertEquals(expected, actual);
    }
}
