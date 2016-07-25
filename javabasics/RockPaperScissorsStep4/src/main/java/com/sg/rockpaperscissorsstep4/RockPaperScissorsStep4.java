/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.rockpaperscissorsstep4;

import static com.sg.rockpaperscissorsstep4.RockPaperScissorsStep4.getUserInput;
import java.util.Random;
import java.util.Scanner;

/**
 * Requirements In this lab, you will write a program that plays the game Rock,
 * Paper, Scissors. The rules of the game are as follows: 1. Each player chooses
 * Rock, Paper or Scissors. 2. If both players choose the same thing, the round
 * is a tie. 3. Otherwise: a. Paper wraps Rock to win b. Scissors cut Paper to
 * win c. Rock breaks Scissors to win Your program must have the following
 * features: 1. This program will be a Java Console Application called
 * RockPaperScissorsStep4. a. Copy the code created in Step 3 to your new
 * project to use as a starting point. 2. In this Step, you will add code that
 * does the following: a. Asks the user if he/she wants to play again after all
 * rounds have been completed. b. If user says No, the program prints out a
 * message saying, “Thanks for playing!” and then exits. c. If user says Yes,
 * the program starts over, asking the user how many rounds he/she would like to
 * play.
 *
 * @author apprentice
 */
public class RockPaperScissorsStep4 {

    public static void main(String[] args) {
        i();
    }

    public static void i() {
        boolean replay = true;
        while (replay == true) {
            gameLogic();
            if (playAgain() == 2) {
                replay = false;
                System.out.println("Thanks for playing!!!");
            } else if (playAgain() == 1) {
                replay = true;

            }
        }
    }

    public static String getUserInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    private static int rounds() {
        System.out.println("Lets play rock, paper, scissors!");
        String userRounds = getUserInput("Please select the number of rounds you would like to play (1-10):  ");

        int rounds = Integer.parseInt(userRounds);
        int minRounds = 1;
        int maxRounds = 10;

        if (rounds < minRounds || rounds > maxRounds) {
            System.out.println("Please Select a valid number of rounds (1-10)");
        }
        return rounds;
    }

    private static int userChoice() {

        String userChoice = getUserInput("Please pick ROCK(1), PAPER(2), or SCISSORS(3)");
        int player = Integer.parseInt(userChoice);
        return player;
    }

    private static int compChoice() {

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(3 - 1 + 1) + 1;
        return randomNumber;
    }

    public static void gameLogic() {

        int rounds = rounds();
        int loop;
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int computerScore = 0;
        int myScore = 0;
        int tie = 0;

        for (loop = 0; loop < rounds; loop++) {

            int player = userChoice();
            int randomNumber = compChoice();

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

    public static int playAgain() {

        String userChoice = getUserInput("Would you like to play again (1)YES (2)NO");
        int replaySelect = Integer.parseInt(userChoice);
        return replaySelect;
    }
}
