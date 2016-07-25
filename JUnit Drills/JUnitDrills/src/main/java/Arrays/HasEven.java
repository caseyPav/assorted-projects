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
public class HasEven {

    public boolean HasEven(int[] numbers) {
        if (numbers[0] % 2 == 0 || numbers[1] % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
