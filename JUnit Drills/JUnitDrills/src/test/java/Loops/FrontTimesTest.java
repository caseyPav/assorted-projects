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
public class FrontTimesTest {

    String str, expected, actual;
    int n;

    public FrontTimesTest() {
    }

    @Test
    public void FrontTimesTest1() {
        str = "Chocolate";
        n = 2;
        expected = "ChoCho";
        FrontTimes ft = new FrontTimes();
        actual = ft.FrontTimes(str, n);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void FrontTimesTest2() {
        str = "Chocolate";
        n = 3;
        expected = "ChoChoCho";
        FrontTimes ft = new FrontTimes();
        actual = ft.FrontTimes(str, n);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void FrontTimesTest3() {
        str = "Abc";
        n = 3;
        expected = "AbcAbcAbc";
        FrontTimes ft = new FrontTimes();
        actual = ft.FrontTimes(str, n);
        Assert.assertEquals(expected, actual);

    }
}
