/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.simplefileinput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SimpleFileInput {
    
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner (
                new BufferedReader( new FileReader("name.txt")));
        
        while (sc.hasNextLine()){
            String currentString = sc.nextLine();
            System.out.println(currentString);
        
        }
    }
    
}
