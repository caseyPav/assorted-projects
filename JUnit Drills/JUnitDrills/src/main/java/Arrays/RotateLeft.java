/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 * Given an array of ints, return an array with the elements "rotated left" so
 * {1, 2, 3} yields {2, 3, 1}.  *
 * RotateLeft({1, 2, 3}) -> {2, 3, 1} RotateLeft({5, 11, 9}) -> {11, 9, 5}
 * RotateLeft({7, 0, 0}) -> {0, 0, 7}
 *
 * public int[] RotateLeft(int[] numbers) {
 *
 * @author apprentice
 */
public class RotateLeft {

    public int[] RotateLeft(int[] numbers, int shift) {

        if (numbers == null || shift < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        for (int i = 0; i < shift; i++) {
            for (int j = numbers.length - 1; j > 0; j--) {
                int temp = numbers[j];
                numbers[j] = numbers[j - 1];
                numbers[j - 1] = temp;
            }}

            return numbers;
        }}

    

