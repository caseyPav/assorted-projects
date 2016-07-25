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
 *Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements. 

GetMiddle({1, 2, 3}, {4, 5, 6}) -> {2, 5}
GetMiddle({7, 7, 7}, {3, 8, 0}) -> {7, 8}
GetMiddle({5, 2, 9}, {1, 4, 5}) -> {2, 4}

public int[] GetMiddle(int[] a, int[] b) {

}
 * @author apprentice
 */
public class GetMiddleTest {
    int[] a, b, expected, actual;
    
    public GetMiddleTest() {
    }
@Test
public void GetMiddle1(){
    a = new int[]{1,2,3};
    b = new int[]{4,5,6};
    expected = new int[]{2,5};
    GetMiddle gm = new GetMiddle();
    actual = gm.GetMiddle(a,b);
    Assert.assertArrayEquals(expected, actual);
}
@Test
public void GetMiddle2(){
    a = new int[]{7,7,7};
    b = new int[]{3,8,0};
    expected = new int[]{7,8};
    GetMiddle gm = new GetMiddle();
    actual = gm.GetMiddle(a,b);
    Assert.assertArrayEquals(expected, actual);
}
@Test
public void GetMiddle3(){
    a = new int[]{5,2,9};
    b = new int[]{1,4,5};
    expected = new int[]{2,4};
    GetMiddle gm = new GetMiddle();
    actual = gm.GetMiddle(a,b);
    Assert.assertArrayEquals(expected, actual);
}
}
