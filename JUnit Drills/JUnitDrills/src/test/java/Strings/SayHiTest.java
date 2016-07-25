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
public class SayHiTest {

    String name, expected, actual;

    public SayHiTest() {
    }

    @Test
    public void SayHitest1() {
        name = "Bob";
        expected = "Hi Bob";
        SayHi sh = new SayHi();
        actual = sh.SayHi(name);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SayHitest2() {
        name = "Alice";
        expected = "Hi Alice";
        SayHi sh = new SayHi();
        actual = sh.SayHi(name);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SayHitest3() {
        name = "X";
        expected = "Hi X";
        SayHi sh = new SayHi();
        actual = sh.SayHi(name);
        Assert.assertEquals(expected, actual);
    }
}
