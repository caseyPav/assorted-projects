/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.factorizor;

import java.util.Scanner;

/**
 *
 * @author casey
 */
public class Factorizor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int factor;
        int factorNumber = 1;

        System.out.print("What number would you like to factor?   ");
        factor = sc.nextInt();

        System.out.println("\nThe factors of " + factor + " are");

        //factor the number and display results
        while (factorNumber <= factor) {
            if (factor % factorNumber == 0) {
                System.out.println("\n" + factorNumber);
            }
            factorNumber++;
        }

        //check for perfect number
        int perfectCheck = 0;
        for (int n = 1; n <= factor / 2; n++) {
            if (factor % n == 0) {
                perfectCheck += n;
            }
        }
        if (perfectCheck == factor) {
            System.out.println("\n" + factor + " is a perfect number");

        } else {
            System.out.println("\n" + factor + " is not a perfect number");

        }

        // check for prime
        int primeCheck = 2;
        int primeCheckResult = 0;

        while (primeCheck <= factor / 2) {
            if (factor % primeCheck == 0) {
                primeCheckResult = 1;
            }
            primeCheck++;
        }
        if (primeCheckResult == 1) {
            System.out.println("\n" + factor + " is not a prime number.");
        } else {
            System.out.println("\n" + factor + " is a prime number.");
        }
    }

}
