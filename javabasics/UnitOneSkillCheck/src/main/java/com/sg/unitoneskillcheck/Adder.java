/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.unitoneskillcheck;

import java.util.Scanner;

/**
 *01- Adder

Create a new Java class called Adder (make sure you create a 'main' method).
Implement a non-static method called add that takes two integers as parameters and returns an integer that is the sum of the two parameters.
Implement test code in your main method that calls the add method.  Test with the following input parameters (the code in main must print out the results of each set of parameters to the console):
1 and 1
2 and 3
5 and 8
95 and 42
 * @author apprentice
 */
public class Adder {
    


    public static void main(String[] args) {
            
    
        add(1,1);
        add(2,3);
        add(5,8);
        add(95,42);
    }
    
    
    public static void add(int num1, int num2){
            
     
        int sum = num1 + num2;

        System.out.println("sum is =" + sum);
        
            }
}
