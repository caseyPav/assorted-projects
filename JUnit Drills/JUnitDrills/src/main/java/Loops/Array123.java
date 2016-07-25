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
public class Array123 {

    public boolean Array123(int[] numbers) {
        String s = "";
        s = Arrays.toString(numbers);
        return s.contains("1, 2, 3");

    }

}
