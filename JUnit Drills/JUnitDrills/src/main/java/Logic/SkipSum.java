/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author apprentice
 */
public class SkipSum {

    public int SkipSum(int a, int b) {
        int sum = 0;

        if ((a + b) >= 10 && (a + b) <= 19) {
            sum = 20;
        } else {
            sum = a + b;
        }

        return sum;
    }
}
