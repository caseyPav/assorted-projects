/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addingloop;

import java.util.Scanner;

/**
 *
 * @author casey
 */
public class AddingLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int user;
        int total = 0;
        
        
        System.out.println("im a thing that will add numbers until you enter zero. hello.");
        System.out.println("you can call me ralph");
        System.out.println("Give me a number ");
        user = sc.nextInt();
        
        while (user != 0){
        total = total + user;
            System.out.println("total so far is " + total);
            System.out.println("enter another number to add");
            user = sc.nextInt();
        }
            
    }
    
}
