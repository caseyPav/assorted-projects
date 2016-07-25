/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.spaceboxing;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SpaceBoxing {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("I have information on the following planets ");
        System.out.println("(1)Venus   (2)Mars   (3)Jupiter");
        System.out.println("(4)Saturn   (5)Uranus  (6)Neptune");
        int choice = sc.nextInt();
        System.out.println("How much do you weight in pounds? ");
        double weight = sc.nextDouble();
        double adjustedWeight = 0;
        
        
        
        if (choice == 1){
            adjustedWeight = (weight * .78d);
        }
        else if (choice == 2){
            adjustedWeight  =  (weight * .39d);
        }
        else if (choice == 3){
            adjustedWeight = (weight * 2.65d);
        }
        else if (choice == 4){
            adjustedWeight = (weight * 1.17d);
        }
        else if (choice == 5){
            adjustedWeight = (weight * 1.05d);
        
        }
        else if (choice == 6){
            adjustedWeight = (weight * 1.23d);
        }
        
        System.out.println("you weigh" + adjustedWeight);
    }
    
}
