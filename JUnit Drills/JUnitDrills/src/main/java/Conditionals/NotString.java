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
public class NotString {

    public String NotString(String s) {
        String ns;
        if (s.contains("not")) {
            return ns = s;
        } else {
            return ns = ("not " + s);
        }
    }
}
