/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal. 

SameFirstLast({1, 2, 3}) -> false
SameFirstLast({1, 2, 3, 1}) -> true
SameFirstLast({1, 2, 1}) -> true

public boolean SameFirstLast(int[] numbers) {

}
 * @author apprentice
 */
public class SameFirstLast {
    public boolean SameFirstLast(int [] numbers){
    
            if (numbers[0] == (numbers[numbers.length - 1])) {
            return true;
        } else {
            return false;
        }
    
    }
}
