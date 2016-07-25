/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.collatzsequence;

import java.util.Scanner;

/**
 *
 * @author casey
 */
public class CollatzSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Starting Number: ");
        int n = sc.nextInt();
        int counter = 0;
        int count = 0;
        int largestNumber = 0;
        System.out.println();

        while (n != 1) {
            if (n % 2 == 0) {
                System.out.print((n = (n / 2)) + " ");
                count++;
                counter++;
            } else {
                System.out.print((n = (n * 3) + 1) + " ");
                count++;
                counter++;
            }

            if (n > largestNumber) {
                largestNumber = n;
            }

            if (counter == 9) {
                counter = 0;
                System.out.print("\n");
            }
        }

        System.out.println();
        System.out.println("done after " + count + " runs");
        System.out.println("largest value was " + largestNumber + ".");
    }

}


