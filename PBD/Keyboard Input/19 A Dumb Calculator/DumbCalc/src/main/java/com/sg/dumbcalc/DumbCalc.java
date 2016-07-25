/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dumbcalc;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DumbCalc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your first number ? ");
        float num1 = sc.nextFloat();
        System.out.println("what is your second number ? ");
        float num2 = sc.nextFloat();
        System.out.println("what is your third number ? ");
        float num3 = sc.nextFloat();
        
        
       float sum = (num1 + num2 + num3);
       
        System.out.println("your total is " +sum );
        
        
        
        
    }
    
}
