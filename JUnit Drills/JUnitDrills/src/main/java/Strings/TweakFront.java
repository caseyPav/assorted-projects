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
public class TweakFront {

    public String TweakFront(String str) {
        String t = str.substring(2, str.length());
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            return "ab" + t;
        } else if (str.charAt(0) == 'a') {
            return "a" + t;
        } else if (str.charAt(1) == 'b') {
            return "b" + t;
        } else {
            return t;
        }

    }

}
