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
public class SubStringMatch {

    public int SubStringMatch(String a, String b) {
        int l = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < l - 1; i++) {
            String a1 = a.substring(i, i + 2);
            String b1 = b.substring(i, i + 2);
            if (a1.equals(b1)) {
                count++;
            }
        }

        return count;
    }

}
