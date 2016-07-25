/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.howoldareyou;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HowOldAreYou {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = sc.nextInt();
        
        if (age < 16){
            System.out.println("you cant drive");
        }
        if (age < 18){
            System.out.println("you cant vote");
        }
        if (age < 21){
            System.out.println("you cant drink");
           
        }
        if (age < 25){
            System.out.println("you cant rent a car");
        }
        if (age >= 25){
            System.out.println("you can do anything legal");
        }
    }
    
}
