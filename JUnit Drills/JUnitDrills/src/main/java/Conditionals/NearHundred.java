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
public class NearHundred {

    public boolean NearHundred(int n) {
        boolean result;
        if ((n + 10) >= 100 || n>100 && (n - 10) <= 100) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
