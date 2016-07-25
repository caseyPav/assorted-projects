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
public class Count9 {

    public int Count9(int[] numbers) {
        int count = 0;
        for (int n : numbers) {
            if (9 == n) {
                count++;
            }
        }
        return count;

    }

}
