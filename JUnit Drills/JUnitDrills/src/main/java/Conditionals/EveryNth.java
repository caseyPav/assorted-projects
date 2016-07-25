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
public class EveryNth {

    public String EveryNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i = i + n) {
            result += str.charAt(i);
        }
        return result;

    }

}
