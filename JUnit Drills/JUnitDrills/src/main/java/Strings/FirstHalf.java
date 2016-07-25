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
public class FirstHalf {

    public String FirstHalf(String str) {
        String t = str.substring(0, (str.length() / 2));
        return t;

    }
}
