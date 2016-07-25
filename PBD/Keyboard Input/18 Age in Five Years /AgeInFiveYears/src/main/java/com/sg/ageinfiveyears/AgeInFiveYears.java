/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.ageinfiveyears;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AgeInFiveYears {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name");
        String name = sc.nextLine();
        System.out.println("hi" + name + "how old are you?");   
        int age = sc.nextInt();
        
        int ageFuture = (age + 5);
        
        System.out.println("did you know in five years youll be " + ageFuture);
        
    }
    
}
