/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

/**
 *
 * @author apprentice
 */
public class AltPairs {

    public String AltPairs(String str) {
        String t;
        int l = str.length();
        if (l < 7) {
            t = str.substring(0, 2) + str.substring(4, 6);

            return t;
        } else {
            t = str.substring(0, 2) + str.substring(4, 6) + str.substring(8, 10);
            return t;
        }

    }
}
