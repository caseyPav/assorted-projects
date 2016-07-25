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
public class SoAlone {

    public boolean SoAlone(int a, int b) {
        boolean result;
        if (a >= 13 && a <= 20 && b >= 13 && b <= 20) {
            return false;
        } else if (a >= 13 && a <= 20 || b >= 13 && b <= 20) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
