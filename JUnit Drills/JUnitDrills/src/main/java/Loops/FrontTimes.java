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
public class FrontTimes {

    public String FrontTimes(String str, int n) {

        String working = str.substring(0, 3);
        String result = "";
        for (int i = 0; i < n; i += 1) {
            result += working;
        }
        return result;
    }
}
