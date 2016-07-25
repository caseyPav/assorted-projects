/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.bmicalc;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class bmiCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("what is your height in meters ");
        float height = sc.nextFloat();
        System.out.println("what is your weight in kg");
        float weight = sc.nextFloat();
        
        float bmi = (weight/(height * height));
        
        System.out.println("your bmi is " +bmi );
        
        
    }
    
}
