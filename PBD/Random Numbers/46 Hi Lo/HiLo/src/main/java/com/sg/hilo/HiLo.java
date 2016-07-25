/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.hilo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author casey
 */
public class HiLo {
    public static void main(String[] args) {
        
        Random r = new Random();
        Scanner sc = new Scanner (System.in);
        
        int number = (1 + r.nextInt(100));
        int guess;
        
        System.out.println("I am thinking of a number between 1-100");
        System.out.println("try and guess");
        guess = sc.nextInt();
        
        if ( number == guess)
            System.out.println("RIGHT!!!!!");
        else if (number > guess)
            System.out.println("low");
        else if ( number < guess)
            System.out.println("high");
        
    }
    
}
