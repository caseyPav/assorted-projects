/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.safesquare;

import java.util.Scanner;

/**
 *
 * @author casey
 */
public class SafeSquare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("SQUARE ROOT!");
        
        double user;
       do{
        System.out.println("Enter a number: ");
        user = sc.nextDouble();}
       while (user < 1);
       
      
       
        System.out.println(Math.sqrt(user));
        
        
        
    }
    
}
