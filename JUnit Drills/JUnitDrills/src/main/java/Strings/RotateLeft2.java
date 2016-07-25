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
public class RotateLeft2 {

    public String Rotateleft2(String str) {
        int l = str.length();
        if (l < 3) {
            return str;
        } else {
            return str.substring(2, l) + str.substring(0, 2);
        }

    }
}
