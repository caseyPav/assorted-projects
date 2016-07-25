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
public class MiddleTwo {

    public String MiddleTwo(String str) {
        int l = str.length();
        String ns = str.substring(((l / 2) - 1), ((l / 2) + 1));
        return ns;

    }

}
