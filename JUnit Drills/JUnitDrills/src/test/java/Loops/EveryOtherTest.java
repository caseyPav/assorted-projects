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
public class EveryOtherTest {

    String str, expected, actual;

    public EveryOtherTest() {
    }

    @Test
    public void EveryOtherTest1() {
        str = "Hello";
        expected = "Hlo";
        EveryOther eo = new EveryOther();
        actual = eo.EveryOther(str);
        Assert.assertEquals(expected, actual);

    }
        @Test
    public void EveryOtherTest2() {
        str = "Hi";
        expected = "H";
        EveryOther eo = new EveryOther();
        actual = eo.EveryOther(str);
        Assert.assertEquals(expected, actual);

    }
        @Test
    public void EveryOtherTest3() {
        str = "Heeololeo";
        expected = "Hello";
        EveryOther eo = new EveryOther();
        actual = eo.EveryOther(str);
        Assert.assertEquals(expected, actual);

    }
}
