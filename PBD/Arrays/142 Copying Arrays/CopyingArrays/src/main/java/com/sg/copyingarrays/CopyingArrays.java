/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.copyingarrays;

/**
 *
 * @author apprentice
 */
public class CopyingArrays {
    public static void main(String[] args) {
        
        
        
        int[] ar1 = new int[10];
        for(int i = 0; i <  ar1.length; i++) {
            ar1[i] = (int)(Math.random() * 100);
            
        int[] ar2 = ar1; 
        
        
            System.out.print(ar1[i] + "  ");
            System.out.print(ar2[i] + "  ");
            
        }
    }
    
}
