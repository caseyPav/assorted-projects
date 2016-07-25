/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tem
 */
package com.sg.rockpaperscissorsstep2;

import java.util.Random;
import java.util.Scanner;

/**
 * Requirements In this lab, you will write a program that plays the game Rock,
 * Paper, Scissors. The rules of the game are as follows: 1. Each player chooses
 * Rock, Paper or Scissors. 2. If both players choose the same thing, the round
 * is a tie. 3. Otherwise: a. Paper wraps Rock to win b. Scissors cut Paper to
 * win c. Rock breaks Scissors to win Your program must have the following
 * features: 1. This program will be a Java Console Application called
 * RockPaperScissorsStep2. a. Copy the code created in Step 1 to your new
 * project to use as a starting point. 2. In this Step, you will add code that
 * does the following: 3. Asks the user how many rounds he/she wants to play. 4.
 * Maximum number of rounds = 10, minimum number of rounds = 1. If the user asks
 * for something outside this range, the program prints and error message and
 * quits. 5. If the number of round is in range, the program plays that number
 * of rounds. Each round is played according to the requirements in Step 1.
 *
 * @author acid_burn
 */
public class RockPaperScissorsStep2 {

    public static String getUserInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    public static void main(String[] args) {

        System.out.println("Lets play rock, paper, scissors!");
        String userRounds = getUserInput("Please select the number of rounds you would like to play (1-10):  ");

        int rounds = Integer.parseInt(userRounds);
        int minRounds = 1;
        int maxRounds = 10;

        if (rounds < minRounds || rounds > maxRounds) {
            System.out.println("Please Select a valid number of rounds (1-10)");
            return;

        }

        int loop;
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        for (loop = 0; loop < rounds; loop++) {
            String userChoice = getUserInput("Please pick ROCK(1), PAPER(2), or SCISSORS(3)");
            int player = Integer.parseInt(userChoice);

            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(3 - 1 + 1) + 1;

            if (randomNumber == rock) {
                if (player == rock) {
                    System.out.println("You chose ROCK. Computer chose ROCK: TIE");
                } else if (player == paper) {
                    System.out.println("You chose PAPER. Computer chose ROCK: YOU WIN");
                } else if (player == scissors) {
                    System.out.println("You chose SCISSORS. Computer chose ROCK: YOU LOSE");
                }
            } else if (randomNumber == paper) {
                if (player == rock) {
                    System.out.println(" You chose ROCK. Computer chose PAPER: YOU LOSE");
                } else if (player == paper) {
                    System.out.println("You chose PAPER. Computer chose PAPER: TIE");
                } else if (player == scissors) {
                    System.out.println("You chose SCISSORS. Computer chose PAPER: YOU WIN");
                }

            } else if (randomNumber == scissors) {
                if (player == rock) {
                    System.out.println("You chose ROCK. Computer chose SCISSORS: YOU WIN");
                } else if (player == paper) {
                    System.out.println("You chose PAPER. Computer chose SCISSORS: YOU LOSE");
                } else if (player == scissors) {
                    System.out.println("You chose SCISSORS. Computer chose SCISSORS: TIE");
                }
            }

        }

    }

}
