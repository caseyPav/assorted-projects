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
public class IcyHotTest {
    boolean expected, actual; 
    int temp1, temp2;
    public IcyHotTest() {
    }

    @Test
    public void IcyHotTest1(){
    temp1 = 120;
    temp2 = -1;
    expected = true;
    IcyHot ih = new IcyHot();
    actual = ih.IcyHot(temp1, temp2);
    Assert.assertEquals(expected, actual);   
    }
      @Test
    public void IcyHotTest2(){
    temp1 = -1;
    temp2 = 120;
    expected = true;
    IcyHot ih = new IcyHot();
    actual = ih.IcyHot(temp1, temp2);
    Assert.assertEquals(expected, actual);   
    }
      @Test
    public void IcyHotTest3(){
    temp1 = 2;
    temp2 = 120;
    expected = false;
    IcyHot ih = new IcyHot();
    actual = ih.IcyHot(temp1, temp2);
    Assert.assertEquals(expected, actual);   
    }
}
