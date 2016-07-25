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
public class Multiple3or5 {

    public boolean Multiple3or5(int number) {
        boolean result;
        if ((number % 5) == 0 || (number % 3) == 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}
