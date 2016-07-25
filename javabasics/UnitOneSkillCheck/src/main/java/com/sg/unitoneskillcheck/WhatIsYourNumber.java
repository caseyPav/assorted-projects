/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.unitoneskillcheck;

import java.util.Scanner;

/**
 * Create a new Java class called WhatIsYourNumber (make sure you create a
 * 'main' method). Implement code in the main method that does the following:
 * Asks the user for an integer Prints that integer to the screen Prints all of
 * the number from 0 to the user's number to the screen, one number per line
 * Prints "Thank you for playing” to the screen
 *
 * @author apprentice
 */
public class WhatIsYourNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int user;

        System.out.println("please enter a number");
        user = sc.nextInt();

        for (int count = 0; count <= user; count++) {
            System.out.println(count);
        }
        System.out.println("Thank you for playing");
     

    }

}
