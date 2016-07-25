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
public class StringX {

    public String StringX(String str) {
        String t = "";
        if (str.startsWith("x") && str.endsWith("x")) {
            t = str.replace("x", "");
            return "x" + t + "x";
        } else {
            t = str.replace("x", "");
            return t;
        }

    }

}
