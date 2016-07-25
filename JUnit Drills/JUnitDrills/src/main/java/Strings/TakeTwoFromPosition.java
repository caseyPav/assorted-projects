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
public class TakeTwoFromPosition {

    public String TakeTwoFromPosition(String str, int n) {
        int l = str.length();
        String ns;
        if ((l - n) > n + 1) {
            ns = str.substring(n, n + 2);
            return ns;
        } else {
            ns = str.substring(0, 2);
            return ns;
        }

    }

}
