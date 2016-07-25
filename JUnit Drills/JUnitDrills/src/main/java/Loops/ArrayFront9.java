/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

/**
 *
 * @author apprentice
 */
public class ArrayFront9 {
    
        public int ArrayFront9(int[] numbers) {
        int count = 0;
        for (int n : numbers) {
            if (9 == n) {
                if(n<=4)
                count++;
            }
        }
        return count;

    }
    
}
