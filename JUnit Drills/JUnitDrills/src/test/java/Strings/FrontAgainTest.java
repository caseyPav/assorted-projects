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
public class FrontAgainTest {
    String str;
    boolean expected,actual;
    
    public FrontAgainTest() {
    }

        @Test
    public void FrontAgainTest1() {
        str = "edited";
        expected = true;
        FrontAgain q = new FrontAgain();
        actual = q.FrontAgain(str);
        Assert.assertEquals(expected, actual);
    }
            @Test
    public void FrontAgainTest2() {
        str = "edit";
        expected = false;
        FrontAgain q = new FrontAgain();
        actual = q.FrontAgain(str);
        Assert.assertEquals(expected, actual);
    }
            @Test
    public void FrontAgainTest3() {
        str = "ed";
        expected = true;
        FrontAgain q = new FrontAgain();
        actual = q.FrontAgain(str);
        Assert.assertEquals(expected, actual);
    }
}
