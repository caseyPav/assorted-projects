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
public class ConCat {

    public String ConCat(String a, String b) {
        String ns;
        ns = (a + b);
        ns = ns.replaceAll("(.)\\1+", "$1");
        return ns;
    }

}
