/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class SoAloneTest {
        int a,b;
    boolean actual, expected;
    public SoAloneTest() {
    }

        @Test
    public void SoAloneTest1(){
    a=13;
    b=99;
    expected = true;
    SoAlone sa = new SoAlone();
    actual = sa.SoAlone(a,b);
    Assert.assertEquals(expected, actual);
    
    }
            @Test
    public void SoAloneTest2(){
    a=21;
    b=19;
    expected = true;
    SoAlone sa = new SoAlone();
    actual = sa.SoAlone(a,b);
    Assert.assertEquals(expected, actual);
    
    }
            @Test
    public void SoAloneTest3(){
    a=13;
    b=13;
    expected = false;
    SoAlone sa = new SoAlone();
    actual = sa.SoAlone(a,b);
    Assert.assertEquals(expected, actual);
    
    }
}
