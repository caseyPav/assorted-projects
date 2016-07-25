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
public class MinCat {
    public String MinCat(String a, String b) {
        int al = a.length();
        int bl = b.length();
        String ns = "";
        int s1 = al-bl;
        int s2 = bl-al;
        int f1 = al-s1;
        int f2 = bl-s2;
        
        if(al>bl){return ns = a.substring(f1, al)+b;}
        else{return ns = a+b.substring(f2, bl);}
        
}
    
}
