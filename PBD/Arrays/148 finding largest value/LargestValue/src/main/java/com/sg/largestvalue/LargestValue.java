/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.largestvalue;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class LargestValue {
    
    
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] ar1 = new int[10];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = (int) (Math.random() * 100);
        }
        
        int searchFor;
        System.out.println("value to find");
        searchFor = sc.nextInt();
        
        Arrays.sort(ar1);
        int result = Arrays.binarySearch(ar1, searchFor);
        
        System.out.println(result);
        
        
        
    }
}
