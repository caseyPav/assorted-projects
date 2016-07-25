/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.unitoneskillcheck;

/**
 * Create a new Java class called Counter (make sure you create a 'main'
 * method). Implement a non-static method called toTen that takes no parameters
 * and returns nothing. This method should simply print the numbers from 1 to 10
 * to the screen, one number per line. Implement this method in the most
 * efficient way you can. Implement test code in your main method that calls the
 * toTen method. Implement a non-static method called toN that takes one integer
 * parameter and returns nothing. This method should simply print the number
 * from 0 to the value of the parameters to the screen, one number per line.
 * Implement test code in your main method that calls the toN method with the
 * following inputs: 3 8 200
 *
 * @author apprentice
 */
public class Counter {

    public static void main(String[] args) {

        toTen();

        toN(3);
        
        toN(8);
        
        toN(200);

    }

    public static void toTen() {

        int countTo = 10;

        for (int count = 0; count <= countTo; count++) {

            System.out.println(count);

        }
        
    }

    public static void toN(int n) {

        for (int count1 = 0; count1 <= n; count1++) {
            System.out.println(count1);

        }

    }

}
