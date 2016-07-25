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
public class RemoveDel {

    public String RemoveDel(String str) {
        int i = str.length();
        
        String ns;
        if (str.substring(1,3).contains("del")) {
            return ns = (str.substring(0) + str.substring(4 - i));
            
        } else {
            return str;
        }

    }
}
