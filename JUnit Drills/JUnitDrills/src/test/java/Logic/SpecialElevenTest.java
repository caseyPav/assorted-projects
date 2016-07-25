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
public class SpecialElevenTest {

    int n;
    boolean actual, expected;

    public SpecialElevenTest() {
    }

    @Test
    public void SpecialEleventest1() {
        n = 22;
        expected = true;
        SpecialEleven se = new SpecialEleven();
        actual = se.SpecialEleven(n);
        Assert.assertEquals(expected, actual);

    }
        @Test
    public void SpecialEleventest2() {
        n = 23;
        expected = true;
        SpecialEleven se = new SpecialEleven();
        actual = se.SpecialEleven(n);
        Assert.assertEquals(expected, actual);

    }
        @Test
    public void SpecialEleventest3() {
        n = 24;
        expected = false;
        SpecialEleven se = new SpecialEleven();
        actual = se.SpecialEleven(n);
        Assert.assertEquals(expected, actual);

    }
}
