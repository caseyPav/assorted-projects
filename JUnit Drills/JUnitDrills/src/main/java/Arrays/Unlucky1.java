/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author apprentice
 */
public class Unlucky1 {

    public boolean Unlucky1(int[] numbers) {
        if ((numbers[0] == 1 && numbers[1] == 3) || (numbers[1] == 1 && numbers[2] == 3)) {
            return true;
        } else if (((numbers[numbers.length - 2] == 1 && numbers[numbers.length - 1] == 3))) {
            return true;
        } else {
            return false;
        }
    }

}
