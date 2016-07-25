/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.countingmachine2;

import java.util.Scanner;

/**
 *
 * @author casey
 */
public class CountingMachine2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Count From: ");
        int start = sc.nextInt();
        System.out.println("Count to: ");
        int end = sc.nextInt();
        System.out.println("Count by: ");
        int by = sc.nextInt();
        
        
        for( int n = start; n < end; n = n + by)
            System.out.println(n);
    }
    
}
