/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class Front3Test {

    String expected, actual, str;

    public Front3Test() {
    }

    @Test
    public void Front3Test1() {
        str = "Microsoft";
        expected = "MicMicMic";
        Front3 f = new Front3();
        actual = f.Front3(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Front3Test2() {
        str = "Chocolate";
        expected = "ChoChoCho";
        Front3 f = new Front3();
        actual = f.Front3(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Front3Test3() {
        str = "at";
        expected = "atatat";
        Front3 f = new Front3();
        actual = f.Front3(str);
        Assert.assertEquals(expected, actual);
    }
}
