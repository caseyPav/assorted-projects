/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.threecardmonte;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author casey
 */
public class ThreeCardMonte {
            public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int number = ( 1+ r.nextInt(3));
        int guess;
        
        System.out.println("three card monte");
        System.out.println(" cup(1)     cup(2)     cup(3)");
        System.out.println(">");
        guess = sc.nextInt();
        
        if (guess == number)
            System.out.println("you win");
        else if(guess != number )
                System.out.println("you lose ");
        
        
        
            System.out.println("the cup was " + number);
        
        
        
        
    }
    
}
