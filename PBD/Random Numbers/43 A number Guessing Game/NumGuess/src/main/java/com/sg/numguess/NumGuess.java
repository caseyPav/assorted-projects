/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.numguess;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author casey
 */
public class NumGuess {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int number = ( 1+ r.nextInt(10));
        int guess;
        
        System.out.println("lets play a guessing game");
        System.out.println("whats my number?");
        System.out.println(">");
        guess = sc.nextInt();
        
        if (guess == number)
            System.out.println("you win");
        else if(guess != number )
                System.out.println("you lose ");
        
        
        
            System.out.println("the number was " + number);
        
        
        
        
    }
}
