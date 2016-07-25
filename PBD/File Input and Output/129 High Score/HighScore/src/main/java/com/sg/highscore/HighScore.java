/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.highscore;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HighScore {
    
    public static void main(String[] args) throws Exception{
       
        
        
         Scanner sc = new Scanner(System.in);
         PrintWriter out = new PrintWriter(new FileWriter("highscores.txt"));
         
         String name;
         int score;
         
         System.out.println("enter your name");
         name = sc.nextLine();
         out.println(name);
         
         System.out.println("enter your score");
         score = sc.nextInt();
         out.println(score);
         out.flush();
         out.close();
   
    
    
    }
    
   
    
}
