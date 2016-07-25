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
public class StartHiTest {

    boolean expected, actual;
    String str;

    public StartHiTest() {
    }

    @Test
    public void StartHiTest1() {
        str = "hi there";
        expected = true;
        StartHi sh = new StartHi();
        actual = sh.StartHi(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void StartHiTest2() {
        str = "hi ";
        expected = true;
        StartHi sh = new StartHi();
        actual = sh.StartHi(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void StartHiTest3() {
        str = "high up ";
        expected = false;
        StartHi sh = new StartHi();
        actual = sh.StartHi(str);
        Assert.assertEquals(expected, actual);
    }
}
