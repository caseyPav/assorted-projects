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
public class Sum {

    public int Sum(int[] numbers) {

        int total = 0;
        for (int element : numbers) {
            total += element;
        }
        return total;
    }

}
