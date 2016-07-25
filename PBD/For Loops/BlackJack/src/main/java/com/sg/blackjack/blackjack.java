/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.blackjack;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class blackjack {

    public static void main(String[] args) {

        System.out.println("BLACKJACK!");

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        
        
        int player1 = (1 + r.nextInt(11));
        int player2 = (1 + r.nextInt(11));
        int playerTotal = player1 + player2;
        int comp1 = (1 + r.nextInt(11));
        int comp2 = (1 + r.nextInt(11));
        int compTotal = comp1 + comp2;
        int hit = (1 + r.nextInt(11));
        boolean dealerBust = false;
        int playerHit = 1;



        System.out.println("you drew a " + player1 + " and a " + player2);
        System.out.println("your total is " + playerTotal);
        
        if (playerHit == 1){
        System.out.println("would you like to hit?     (1)yes or (2)no");
        playerHit = sc.nextInt();
        
        if (playerHit == 1){
        playerTotal = playerTotal + hit;
        
        }if (playerTotal > 21){
            System.out.println("ya busted you goof");
        }
        }
                if (compTotal < 15) {
            compTotal = compTotal + hit;
        }
        if (compTotal > 21) {
            dealerBust = true;
            System.out.println("Dealer Busted! You Win!");
        }
        System.out.println("\nThe dealer has a " + comp1 + " and a " + comp2);
        System.out.println("the dealers total is " + compTotal);

        if (compTotal > playerTotal) {
            System.out.println("you lose ");
        } else if (compTotal < playerTotal) {
            System.out.println("you lose ");
        }

    }

}
