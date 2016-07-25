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
public class SleepingInTest {
    boolean isWeekday, isVacation, expected, actual;
    public SleepingInTest() {
    }

 @Test 
 public void CanSleepInTest1(){
     isWeekday = false;
     isVacation = false;
     expected = true;
     SleepingIn csl = new SleepingIn();
     actual = csl.CanSleepIn(isWeekday, isVacation);
     Assert.assertEquals(expected,actual);
 }
  @Test 
 public void CanSleepInTest2(){
     isWeekday = true;
     isVacation = false;
     expected = false;
     SleepingIn csl = new SleepingIn();
     actual = csl.CanSleepIn(isWeekday, isVacation);
     Assert.assertEquals(expected,actual);
 }
  @Test 
 public void CanSleepInTest3(){
     isWeekday = false;
     isVacation = true;
     expected = true;
     SleepingIn csl = new SleepingIn();
     actual = csl.CanSleepIn(isWeekday, isVacation);
     Assert.assertEquals(expected,actual);
 }
}
