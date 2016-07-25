/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class SubStringMatchTest {

    String a, b;
    int expected, actual;

    public SubStringMatchTest() {
    }

    @Test
    public void SubStringMatchTest1() {
        a = "xxcaazz";
        b = "xxbaaz";
        expected = 3;
        SubStringMatch ssm = new SubStringMatch();
        actual = ssm.SubStringMatch(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SubStringMatchTest2() {
        a = "abc";
        b = "abc";
        expected = 2;
        SubStringMatch ssm = new SubStringMatch();
        actual = ssm.SubStringMatch(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SubStringMatchTest3() {
        a = "abc";
        b = "acx";
        expected = 0;
        SubStringMatch ssm = new SubStringMatch();
        actual = ssm.SubStringMatch(a, b);
        Assert.assertEquals(expected, actual);
    }
}
