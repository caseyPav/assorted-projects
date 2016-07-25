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
public class BackAround {

    public String BackAround(String str) {

        int l = str.length();

        String ns = (str.charAt(l - 1) + str.substring(0,l) + str.charAt(l - 1));
        return ns;

    }
}
