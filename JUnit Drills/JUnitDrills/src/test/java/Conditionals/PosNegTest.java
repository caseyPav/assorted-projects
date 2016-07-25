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
public class PosNegTest {
    int a, b;
    boolean negative, actual, expected;
    
    public PosNegTest() {
    }

@Test
public void PosNegTest1(){
    a=1;
    b=-1;
    negative = false;
    expected= true;
    PosNeg pn = new PosNeg();
    actual = pn.PosNeg(a, b, negative);
    Assert.assertEquals(expected, actual);

}
@Test
public void PosNegTest2(){
    a=-1;
    b=1;
    negative = false;
    expected= true;
    PosNeg pn = new PosNeg();
    actual = pn.PosNeg(a, b, negative);
    Assert.assertEquals(expected, actual);

}
@Test
public void PosNegTest3(){
    a=-4;
    b=-5;
    negative = true;
    expected= true;
    PosNeg pn = new PosNeg();
    actual = pn.PosNeg(a, b, negative);
    Assert.assertEquals(expected, actual);

}
}
