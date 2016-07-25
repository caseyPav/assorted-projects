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
public class AtFirst {
    public String AtFirst(String str) {
        if(str.length()<2){return (str +"@");}
        else{return str.substring(0, 2);}

}
}
