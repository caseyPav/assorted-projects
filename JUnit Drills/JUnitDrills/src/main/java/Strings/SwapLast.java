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
public class SwapLast {

    public String SwapLast(String str) {
        int l = str.length();
        String ns;
        char a = str.charAt(l - 1);
        char b = str.charAt(l - 2);
        String j = "" + a + b;

        return ns = str.substring(0, (l - 2)) + j;

    }

}
