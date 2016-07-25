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
public class Makes10Test {
    
    int a, b;
    boolean expected, actual;
    
    public Makes10Test() {
    }
    
    @Test
    public void Makes10Test1() {
        a = 9;
        b = 10;
        expected = true;
        Makes10 mt = new Makes10();
        actual = mt.Makes10(a, b);
        Assert.assertEquals(expected, actual);
        
    }
        
    @Test
    public void Makes10Test2() {
        a = 9;
        b = 9;
        expected = false;
        Makes10 mt = new Makes10();
        actual = mt.Makes10(a, b);
        Assert.assertEquals(expected, actual);
        
    }
        
    @Test
    public void Makes10Test3() {
        a = 9;
        b = 1;
        expected = true;
        Makes10 mt = new Makes10();
        actual = mt.Makes10(a, b);
        Assert.assertEquals(expected, actual);
        
    }
}
