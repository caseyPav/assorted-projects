/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author apprentice
 */
public class LoveSix {

    public boolean LoveSix(int a, int b) {
        boolean result;
        if (a == 6 || b == 6) {
            result = true;
        } else if (a + b == 6) {
            result = true;
        } else if (a - b == 6) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}
