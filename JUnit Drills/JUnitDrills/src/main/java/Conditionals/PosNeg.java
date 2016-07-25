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
public class PosNeg {

    public boolean PosNeg(int a, int b, boolean negative) {
        boolean result;
        if (a < 0 && b > 0 || a > 0 && b < 0) {
            result = true;
        } else if (a < 0 && b < 0 && negative == true) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
