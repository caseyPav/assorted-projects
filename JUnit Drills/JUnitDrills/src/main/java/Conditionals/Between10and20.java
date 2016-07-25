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
public class Between10and20 {

    public boolean Between10and20(int a, int b) {
        boolean result;

        if (a >= 10 && a <= 20 || b >= 10 && b <= 20) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
