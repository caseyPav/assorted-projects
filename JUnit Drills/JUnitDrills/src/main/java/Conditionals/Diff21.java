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
public class Diff21 {

    public int Diff21(int n) {
        int result = 0;
        if (n < 21) {
            result = 21 - n;
        } else if (n == 21) {
            result = 0;
        } else if (n > 21) {
            result = (n - 21)*2;
        }

        return result;
    }

}
