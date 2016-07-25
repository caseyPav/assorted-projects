/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.righttrianglecheck;

import java.util.Scanner;

/**
 *
 * @author casey
 */
public class RightTriangleCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER THREE INTERGERS");
        
        int side1;
        int side2;
        int side3; 
        
        do{
            System.out.println("side 1: ");
            side1 = sc.nextInt();
            System.out.println("side 2");
            side2 = sc.nextInt();
            
        
        }
        while(side1 > side2);
        
        do{
        
            System.out.println("side 3 : ");
            side3 = sc.nextInt();
            
        
        }while (side3 < side2);
        
        
    }
    
}
