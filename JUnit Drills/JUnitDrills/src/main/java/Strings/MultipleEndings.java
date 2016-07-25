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
public class MultipleEndings {
    public String MultipleEndings(String str) {
                String ns;
        if (str.length() < 3) {
            return ns = (str + str + str);
        } else {
            String t = str.substring((str.length()-2),str.length());
            return ns = (t + t + t);
        }

}
    
}
