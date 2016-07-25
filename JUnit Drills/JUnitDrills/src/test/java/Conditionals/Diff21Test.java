/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class Diff21Test {
    int n;
    int expected, actual;
    
   
   public  Diff21Test(){
   
   }
    @Test
   public void Diff21Test1(){
   n = 23;
   expected = 4;
   Diff21 d21 = new Diff21();
   actual = d21.Diff21(n);
   Assert.assertEquals(expected, actual);
   
   }
        @Test
   public void Diff21Test2(){
   n = 10;
   expected = 11;
   Diff21 d21 = new Diff21();
   actual = d21.Diff21(n);
   Assert.assertEquals(expected, actual);
   
   }
       @Test
   public void Diff21Test3(){
   n = 21;
   expected = 0;
   Diff21 d21 = new Diff21();
   actual = d21.Diff21(n);
   Assert.assertEquals(expected, actual);
   
   }
}