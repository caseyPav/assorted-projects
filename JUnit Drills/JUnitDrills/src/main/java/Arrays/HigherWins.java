/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 * Given an array of ints, figure out which is larger between the first and last
 * elements in the array, and set all the other elements to be that value.
 * Return the changed array.  *
 * HigherWins({1, 2, 3}) -> {3, 3, 3} HigherWins({11, 5, 9}) -> {11, 11, 11}
 * HigherWins({2, 11, 3}) -> {3, 3, 3}
 *
 * public int[] HigherWins(int[] numbers) {
 *
 * }
 *
 * @author apprentice
 */
public class HigherWins {

    public int[] HigherWins(int[] numbers) {

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        int[] large = new int[]{largest,largest,largest};
        return large;
    }
}
