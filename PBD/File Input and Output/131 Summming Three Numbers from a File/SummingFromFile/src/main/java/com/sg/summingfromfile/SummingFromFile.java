/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.summingfromfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SummingFromFile {
    
    public static void main(String[] args) throws Exception {
        
        
       Scanner sc1 = new Scanner(System.in);
       
       
       String selection;
        System.out.println("what file would you like to read from?");
        System.out.println("numbers1.txt or numbers2.txt");
        selection = sc1.nextLine();
        
        
        Scanner sc = new Scanner (
                new BufferedReader( new FileReader(selection)));
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        while (sc.hasNextInt()){
             num1 = sc.nextInt();
             num2 = sc.nextInt();
             num3 = sc.nextInt();
            

    }
                    int total = num1 + num2 + num3;
            
            System.out.println(num1 + num2 + num3 + total);
    
}}
