/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

/**
 *
 * @author apprentice
 */
public class Max {

    public int Max(int a, int b, int c) {
        int max = 0;

        if (a > (b & c)) {
            max = a;
        } else if (b > (a & c)) {
            max = b;
        } else if (c > (b & a)) {
            max = c;
        }
        return max;
    }

}
