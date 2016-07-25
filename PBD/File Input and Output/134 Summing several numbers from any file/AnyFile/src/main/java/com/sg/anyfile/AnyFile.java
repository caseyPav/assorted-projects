/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.anyfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AnyFile {
    
    public static void main(String[] args) throws Exception {
        
        
       
        
        Scanner sc = new Scanner (
                new BufferedReader( new FileReader("numbers.txt")));
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        while (sc.hasNextInt()){
             num1 = sc.nextInt();
             num2 = sc.nextInt();
             num3 = sc.nextInt();
            

    }
                    int total = num1 + num2 + num3;
            
            System.out.println(total);
    
}}
