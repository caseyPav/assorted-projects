/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class InRangeTest {

    int n;
    boolean outsideMode, expected, actual;

    public InRangeTest() {
    }

    @Test
    public void InRangeTest1() {
        n = 5;
        outsideMode = false;
        expected = true;
        InRange ir = new InRange();
        actual = ir.InRange(n, outsideMode);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void InRangeTest2() {
        n = 11;
        outsideMode = false;
        expected = false;
        InRange ir = new InRange();
        actual = ir.InRange(n, outsideMode);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void InRangeTest3() {
        n = 11;
        outsideMode = true;
        expected = true;
        InRange ir = new InRange();
        actual = ir.InRange(n, outsideMode);
        Assert.assertEquals(expected, actual);
    }

}
