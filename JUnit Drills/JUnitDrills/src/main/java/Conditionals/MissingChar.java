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
public class MissingChar {

    public String MissingChar(String str, int n) {
        String result;

        result = str.replaceFirst(String.valueOf(str.charAt(n)), "");

        return result;
    }
}
