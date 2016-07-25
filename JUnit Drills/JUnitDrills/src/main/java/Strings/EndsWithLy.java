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
public class EndsWithLy {

    public boolean EndsWithLy(String str) {
        int l = str.length();
        if (l < 2) {
            return false;
        } else if (str.substring((l - 2), l).matches("ly")) {
            return true;
        } else {
            return false;
        }

    }

}
