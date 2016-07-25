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
public class HasTeen {

    public boolean HasTeen(int a, int b, int c) {
        boolean result;

        if (a > 12 && a < 20 || b > 12 && b < 20 || c > 12 && c < 20) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
