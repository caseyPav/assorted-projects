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
public class TakeOne {

    public String TakeOne(String str, boolean fromFront) {
        int l = str.length();
        String ns;
        if (fromFront == true) {
            ns = str.substring(0,1);
            return ns;
        } else {
            ns = str.substring((l-1),l);
            return ns;
        }

    }

}
