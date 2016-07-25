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
public class EndUp {
    public String EndUp(String str) {
        String t= str.substring((str.length()-3), str.length()).toUpperCase();
        return str.substring(0,(str.length()-3))+t;
}
    
}
