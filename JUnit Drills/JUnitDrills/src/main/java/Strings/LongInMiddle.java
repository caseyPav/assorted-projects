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
public class LongInMiddle {

    public String LongInMiddle(String a, String b) {
        String rs;
        if (a.length() > b.length()) {
            return rs = (b + a + b);
        } else {
            return rs = (a + b + a);
        }

    }

}
