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
public class NoTriples {

    public boolean NoTriples(int[] numbers) {
        String s = Arrays.toString(numbers);
        int l = s.length();
        if ((s.substring(0,l-1).contains("1, 1, 1")) || ((s.substring(0,l-1).contains("2, 2, 2")))) {
            return false;
        } else {
            return true;
        }
    }

}
