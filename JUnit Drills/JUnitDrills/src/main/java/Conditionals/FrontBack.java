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
public class FrontBack {

    public String FrontBack(String str) {
        int l = str.length();

        if (l <= 1) {
            return str;
        } else {
            return str.charAt(l - 1) + str.substring(1, l - 1) + str.charAt(0);
        }

    }

}
