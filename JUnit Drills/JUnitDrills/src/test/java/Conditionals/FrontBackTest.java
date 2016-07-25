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
public class FrontBackTest {

    String str, expected, actual;

    public FrontBackTest() {
    }

    @Test
    public void FrontBackTest1() {
        str = "code";
        expected = "eodc";
        FrontBack fb = new FrontBack();
        actual = fb.FrontBack(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FrontBackTest2() {
        str = "x";
        expected = "x";
        FrontBack fb = new FrontBack();
        actual = fb.FrontBack(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void FrontBackTest3() {
        str = "ab";
        expected = "ba";
        FrontBack fb = new FrontBack();
        actual = fb.FrontBack(str);
        Assert.assertEquals(expected, actual);
    }

}
