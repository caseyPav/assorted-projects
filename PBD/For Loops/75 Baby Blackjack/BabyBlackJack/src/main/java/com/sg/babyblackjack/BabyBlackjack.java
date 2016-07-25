/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.babyblackjack;

import java.util.Random;

/**
 *
 * @author casey
 */
public class BabyBlackjack {
    
    public static void main(String[] args) {
        
        System.out.println("BABY BLACKJACK!");
        
        Random r = new Random();
        
        int player1 = (1 + r.nextInt(11));
        int player2 = (1 + r.nextInt(11));
        int playerTotal = player1 + player2;
        int comp1 = (1 + r.nextInt(11));
        int comp2 = (1 + r.nextInt(11)); 
        int compTotal = comp1 + comp2;
        
        System.out.println("you drew a " + player1 + " and a " + player2);
        System.out.println("your total is " + playerTotal);
        
        System.out.println("\nThe dealer has a " + comp1 + " and a " + comp2 );
        System.out.println("the dealers total is " + compTotal);
        
        if(compTotal > playerTotal){
            System.out.println("you lose ");
        }else if (compTotal < playerTotal){
            System.out.println("you lose ");
    }
 
    }
}
