/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.luckysevens;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author zero_cool
 */
public class LuckySevens {

    public static void main(String[] args) {

        String startBet = getUserInput("How many Dollars do you have? ");
        int wallet = Integer.valueOf(startBet);
        int maxWallet;
        int maxWalletCount;
        int die1;
        int die2;
        int count;

        count = 0;
        maxWallet = 0;
        maxWalletCount = 0;

        while (wallet > 0) {
            count++;
            Random generator = new Random();

            die1 = generator.nextInt(6) + 1;
            die2 = generator.nextInt(6) + 1;

            if (die1 + die2 == 7) {
                wallet += 4;
            } else {
                wallet -= 1;
            }

            if (maxWallet < wallet) {
                maxWallet = wallet;
                maxWalletCount = count;
            }

        }
        System.out.println("You went broke after " + count + " rolls");
        System.out.println("You should have stopped after " + maxWalletCount + " rolls when you had $" + maxWallet);

    }

    public static String getUserInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }
}
