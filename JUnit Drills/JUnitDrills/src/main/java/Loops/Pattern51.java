/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import java.util.Arrays;

/**
 *
 * @author apprentice
 */
public class Pattern51 {

    public boolean Pattern51(int[] numbers) {
        String s = Arrays.toString(numbers);
        int l = s.length();
        if (s.substring(0, l).contains("2, 7, 1")) {
            return true;
        } else {
            return false;
        }

    }

}
