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
public class StringSplosion {

    public String StringSplosion(String str) {
        int i = 0;
        int s = str.length();
        String output = "";
        while (i < s+1){
            output = output+str.substring(0, i);
            i++;
        } 
        return output;

    }
}
