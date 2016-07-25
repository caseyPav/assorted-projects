/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.rockpapersciccorsstep3;

import java.util.Random;
import java.util.Scanner;

/**
 * Requirements In this lab, you will write a program that plays the game Rock,
 * Paper, Scissors. The rules of the game are as follows: 1. Each player chooses
 * Rock, Paper or Scissors. 2. If both players choose the same thing, the round
 * is a tie. 3. Otherwise: a. Paper wraps Rock to win b. Scissors cut Paper to
 * win c. Rock breaks Scissors to win Your program must have the following
 * features: 1. This program will be a Java Console Application called
 * RockPaperScissorsStep3. a. Copy the code created in Step 2 to your new
 * project to use as a starting point. 2. In this step, you will add code that
 * does the following: a. Keeps track of how many rounds are ties, user wins or
 * computer wins. b. Hint: create three variables to keep track of these items
 * and update them correctly each round through the loop created in Step 2. c.
 * Prints out the number of ties, user wins, and computer wins and declares the
 * overall winner based on who won more rounds.
 *
 * @author casey
 */
public class RockPaperScissorsStep3 {

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
        int computerScore = 0;
        int myScore = 0;
        int tie = 0;

        for (loop = 0; loop < rounds; loop++) {
            String userChoice = getUserInput("Please pick ROCK(1), PAPER(2), or SCISSORS(3)");
            int player = Integer.parseInt(userChoice);
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(3 - 1 + 1) + 1;

            if (randomNumber == rock) {
                if (player == rock) {
                    System.out.println("You chose ROCK. Computer chose ROCK: TIE");
                    tie = tie + 1;
                } else if (player == paper) {
                    System.out.println("You chose PAPER. Computer chose ROCK: YOU WIN");
                    myScore = myScore + 1;
                } else if (player == scissors) {
                    System.out.println("You chose SCISSORS. Computer chose ROCK: YOU LOSE");
                    computerScore = computerScore + 1;
                }
            } else if (randomNumber == paper) {
                if (player == rock) {
                    System.out.println(" You chose ROCK. Computer chose PAPER: YOU LOSE");
                    computerScore = computerScore + 1;
                } else if (player == paper) {
                    System.out.println("You chose PAPER. Computer chose PAPER: TIE");
                    tie = tie + 1;
                } else if (player == scissors) {
                    System.out.println("You chose SCISSORS. Computer chose PAPER: YOU WIN");
                    myScore = myScore + 1;
                }

            } else if (randomNumber == scissors) {
                if (player == rock) {
                    System.out.println("You chose ROCK. Computer chose SCISSORS: YOU WIN");
                    myScore = myScore + 1;
                } else if (player == paper) {
                    System.out.println("You chose PAPER. Computer chose SCISSORS: YOU LOSE");
                    computerScore = computerScore + 1;
                } else if (player == scissors) {
                    System.out.println("You chose SCISSORS. Computer chose SCISSORS: TIE");
                    tie = tie + 1;
                }
            }

        }
        System.out.println("you won " + myScore);
        System.out.println("the computer won " + computerScore);
        System.out.println("you tied " + tie);

        if (myScore > computerScore) {
            System.out.println("You WIN!!!!");
        } else if (computerScore > myScore) {
            System.out.println("You LOSE :(");

        } else if (computerScore == myScore) {
            System.out.println("You TIED :/");
        }

    }

}
