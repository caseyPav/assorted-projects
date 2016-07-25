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
public class RemoveDelTest {

    String str, expected, actual;

    public RemoveDelTest() {
    }

    @Test
    public void RemoveDelTest1() {
        str = "adelbc";
        expected = "adelbc";
        RemoveDel rd = new RemoveDel();
        actual = rd.RemoveDel(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RemoveDelTest2() {
        str = "adelHello";
        expected = "adelHello";
        RemoveDel rd = new RemoveDel();
        actual = rd.RemoveDel(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RemoveDelTest3() {
        str = "adedbc";
        expected = "adedbc";
        RemoveDel rd = new RemoveDel();
        actual = rd.RemoveDel(str);
        Assert.assertEquals(expected, actual);
    }
}
