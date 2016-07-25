/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *Given an array of ints, figure out which is larger between the first and last elements in the array, and set all the other elements to be that value. Return the changed array. 

HigherWins({1, 2, 3}) -> {3, 3, 3}
HigherWins({11, 5, 9}) -> {11, 11, 11}
HigherWins({2, 11, 3}) -> {3, 3, 3}

public int[] HigherWins(int[] numbers) {

}
 * @author apprentice
 */
public class HigherWinsTest {
    int[] numbers, expected, actual;
    public HigherWinsTest() {
    }
@Test
 public void HighestWinsTest1(){
     numbers = new int[]{1,2,3};
     expected = new int[]{3,3,3};
     HigherWins hw = new HigherWins();
     actual = hw.HigherWins(numbers);
     Assert.assertArrayEquals(expected, actual);    
 }
 @Test
 public void HighestWinsTest2(){
     numbers = new int[]{11,5,9};
     expected = new int[]{11,11,11};
     HigherWins hw = new HigherWins();
     actual = hw.HigherWins(numbers);
     Assert.assertArrayEquals(expected, actual);    
 }
 @Test
 public void HighestWinsTest3(){
     numbers = new int[]{2,11,3};
     expected = new int[]{11,11,11};
     HigherWins hw = new HigherWins();
     actual = hw.HigherWins(numbers);
     Assert.assertArrayEquals(expected, actual);    
 }
}
