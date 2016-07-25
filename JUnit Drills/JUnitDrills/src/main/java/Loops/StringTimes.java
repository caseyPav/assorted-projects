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
public class StringTimes {

    public String StringTimes(String str, int n) {

        String result = "";
        for (int i = 0; i < n; i += 1) {
            result += str;
        }
        return result;
    }
}
