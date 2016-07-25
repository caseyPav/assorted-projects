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
public class Between10and20Test {
    int a,b;
    boolean actual, expected;
    
    public Between10and20Test() {
    }

    @Test
    public void Between10and20Test1(){
    a=12;
    b=99;
    expected = true;
    Between10and20 btt = new Between10and20();
    actual = btt.Between10and20(a,b);
    Assert.assertEquals(expected, actual);
    
    }
        @Test
    public void Between10and20Test2(){
    a=21;
    b=12;
    expected = true;
    Between10and20 btt = new Between10and20();
    actual = btt.Between10and20(a,b);
    Assert.assertEquals(expected, actual);
    
    }
        @Test
    public void Between10and20Test3(){
    a=8;
    b=99;
    expected = false;
    Between10and20 btt = new Between10and20();
    actual = btt.Between10and20(a,b);
    Assert.assertEquals(expected, actual);
    
    }
}
