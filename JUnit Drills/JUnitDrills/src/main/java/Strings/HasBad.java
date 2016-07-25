/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author apprentice
 */
public class HasBad {

    public boolean HasBad(String str) {
        if (str.length() < 3) {
            return false;
        } else if ((str.substring(0, 3).matches("bad")) || ((str.substring(1, 4).matches("bad")))) {
            return true;

        } else {
            return false;
        }

    }
}
