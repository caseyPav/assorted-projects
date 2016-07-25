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
public class DoNotYakTest {

    String str, expected, actual;

    public DoNotYakTest() {
    }

    @Test
    public void DoNotYakTest1() {
        str = "yakpak";
        expected = "pak";
        DoNotYak sh = new DoNotYak();
        actual = sh.DoNotYak(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DoNotYakTest2() {
        str = "pakyak";
        expected = "pak";
        DoNotYak sh = new DoNotYak();
        actual = sh.DoNotYak(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DoNotYakTest3() {
        str = "yak123ya";
        expected = "123ya";
        DoNotYak sh = new DoNotYak();
        actual = sh.DoNotYak(str);
        Assert.assertEquals(expected, actual);
    }
}
