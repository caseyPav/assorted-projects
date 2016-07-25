/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cyoa;

import java.util.Scanner;

/**
 *
 * @author casey
 */
public class CYOA {
    public static void main(String[] args) {
        
        String choiceOne, choiceTwo, choiceThree, choiceFour;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("short boring adventure");
        System.out.println("you are in first room");
        System.out.println("would you like to go to the (kitchen) or (bedroom)");
        System.out.println(">");
        choiceOne = sc.nextLine(    );
        
        if (choiceOne == "kitchen"){
            System.out.println("you are in the kitchen");
            System.out.println("look (left) or (right)");
            System.out.println(">");
            choiceTwo = sc.nextLine();
                if (choiceTwo == "left"){
                    System.out.println("you look left, your see two thing");
                    System.out.println("you want thing (one) or thing (two)");  
                    System.out.println(">");
                    choiceThree = sc.nextLine();
                        if (choiceThree == "one"){
                            System.out.println("bad thing");
                        }else if (choiceThree == "two"){
                            System.out.println("ok thing");
                            return;  }
                }else if (choiceTwo == "right"){
                    System.out.println("you look right you see thing (one) and thing (two)");
                    System.out.println("do you want (one) or (two)");
                    System.out.println(">");
                    choiceFour = sc.nextLine();
                        if (choiceFour == "one"){ 
                            System.out.println("good thing");
                        }else if (choiceFour == "two")
                            System.out.println("terrible thing");}
                }
        } 
            
            
        
            
            
            
        
    }
    
