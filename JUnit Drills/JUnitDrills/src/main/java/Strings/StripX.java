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
public class StripX {

    public String StripX(String str) {
        int l = str.length();
        String s = "";
        if (str.charAt(0) == 'x' && str.charAt(l - 1) == 'x') {
            return s = str.substring(1, l - 1);
        } else if (str.charAt(0) == 'x' && str.charAt(l - 1) != 'x') {
            return s = str.substring(1, l);
        } else if (str.charAt(0) != 'x' && str.charAt(l - 1) == 'x') {
            return s = str.substring(0, l - 1);
        } else {
            return str;
        }

    }

}
