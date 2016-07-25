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
public class Front3 {

    public String Front3(String str) {
        String ns;
        if (str.length() < 3) {
            return ns = (str + str + str);
        } else {
            String t = str.substring(0, 3);
            return ns = (t + t + t);
        }
    }

}
