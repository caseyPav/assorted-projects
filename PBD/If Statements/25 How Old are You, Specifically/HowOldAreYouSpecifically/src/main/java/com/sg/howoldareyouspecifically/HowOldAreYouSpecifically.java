/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.howoldareyouspecifically;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HowOldAreYouSpecifically {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = sc.nextInt();
        
        if (age < 16){
            System.out.println("you cant drive, vote, drink, or rent a car");
        }
        else if (age < 18){
            System.out.println("you can drive but cant vote");
        }
        else if (age < 21){
            System.out.println("you can drive and voat but cant drink or rent a car");
           
        }
        else if (age < 25){
            System.out.println("you cant rent a car but you can drive, vote, and drink");
        }
        else if (age >= 25){
            System.out.println("you can do anything legal");
        }
    }
}
