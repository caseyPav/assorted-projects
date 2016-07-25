/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hilocount;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author casey
 */
public class HiLoCount {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int number = (1 + r.nextInt(100));
        int guess;
        int count = 0;

        System.out.println("I am thinking of a number between 1-100");
        System.out.println("try and guess");
        guess = sc.nextInt();

        while (count < 8) {
            if (number == guess) {
                System.out.println("RIGHT!!!!!");
                return;
            } else if (number > guess) {
                count = count + 1;
                System.out.println("low");
                System.out.println("guess again");
                guess = sc.nextInt();
            } else if (number < guess) {
                count = count + 1;
                System.out.println("high");
                System.out.println("guess again");
                guess = sc.nextInt();
                
            }
            
        }
    }
}
