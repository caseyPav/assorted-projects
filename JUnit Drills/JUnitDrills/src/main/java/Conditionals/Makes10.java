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
public class Makes10 {

    public boolean Makes10(int a, int b) {
        boolean result;
        if (a == 10 || b == 10) {
            result = true;
        } else if ((a + b) == 10) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
