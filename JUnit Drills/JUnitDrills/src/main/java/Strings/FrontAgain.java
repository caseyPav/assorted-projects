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
public class FrontAgain {
    public boolean FrontAgain(String str) {
        int l = str.length();
        if((str.charAt(0) == str.charAt(l-2))&&(str.charAt(1) == str.charAt(l-1))){return true;}
        else{return false;}

}
}
