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
public class IxStartTest {

    boolean expected, actual;
    String str;

    public IxStartTest() {
    }

    @Test
    public void IxStartTest1() {
        str = "mix snacks";
        expected = false;
        IxStart is = new IxStart();
        actual = is.IxStart(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IxStartTest2() {
        str = "pix snacks";
        expected = false;
        IxStart is = new IxStart();
        actual = is.IxStart(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IxStartTest3() {
        str = "miz snacks";
        expected = false;
        IxStart is = new IxStart();
        actual = is.IxStart(str);
        Assert.assertEquals(expected, actual);
    }
}
