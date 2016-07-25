/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.countingmachine;

import java.util.Scanner;

/**
 *
 * @author casey
 */
public class CountingMachine {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("count to: ");
        int end = sc.nextInt();
        
        for(int n = 0 ; n <= end ; n = n+1 ){
            System.out.println(n);
        }
    }
}
