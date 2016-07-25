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
public class TakeOneTest {

    String str, expected, actual;
    boolean fromFront;

    public TakeOneTest() {
    }

    @Test
    public void TakeOneTest1() {
        str = "Hello";
        fromFront = true;
        expected = "H";
        TakeOne q = new TakeOne();
        actual = q.TakeOne(str, fromFront);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TakeOneTest2() {
        str = "Hello";
        fromFront = false;
        expected = "o";
        TakeOne q = new TakeOne();
        actual = q.TakeOne(str, fromFront);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TakeOneTest3() {
        str = "oh";
        fromFront = true;
        expected = "o";
        TakeOne q = new TakeOne();
        actual = q.TakeOne(str, fromFront);
        Assert.assertEquals(expected, actual);
    }
}
