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
public class InRange {

    public boolean InRange(int n, boolean outsideMode) {
        boolean result = false;
        if (outsideMode == false && (n >= 1 && n < +10)) {
            result = true;
        } else if (outsideMode == true && (n <= 1 || n >= 10)) {
            result = true;
        }

        return result;
    }
}
