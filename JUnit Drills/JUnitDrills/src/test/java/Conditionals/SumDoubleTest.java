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
public class SumDoubleTest {
    int a, b, expected, actual;
    
    public SumDoubleTest() {
    }

  @Test
  public void SumDoubleTest1(){
     a = 1;
     b = 2;
     expected = 3;
     SumDouble sd = new SumDouble();
     actual = sd.SumDouble(a, b);
     Assert.assertEquals(expected, actual);
    
  }
    @Test
  public void SumDoubleTest2(){
     a = 3;
     b = 2;
     expected = 5;
     SumDouble sd = new SumDouble();
     actual = sd.SumDouble(a, b);
     Assert.assertEquals(expected, actual);
    
  }
    @Test
  public void SumDoubleTest3(){
     a = 2;
     b = 2;
     expected = 8;
     SumDouble sd = new SumDouble();
     actual = sd.SumDouble(a, b);
     Assert.assertEquals(expected, actual);
    
  }
}
