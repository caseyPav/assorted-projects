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
public class FrontAndBack {

    public String FrontAndBack(String str, int n) {
        int l = str.length();
        String s = (str.substring(0, n) + str.substring(l - n, l));
        return s;

    }

}
