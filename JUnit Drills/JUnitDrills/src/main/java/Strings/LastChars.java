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
public class LastChars {

    public String LastChars(String a, String b) {
        int la = a.length();
        int lb = b.length();
        if (a != null && b != null) {
            if (la == 1) {
                a = "@@@@";
            } else if (lb == 1) {
                b = "@@@@";
            }
            String t;
            return t = a.substring(0, 1) + b.substring((lb - 1), lb);
        }
    return "oops";}

}
