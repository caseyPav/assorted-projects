/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.rockpaperscissorsStep1;

import java.util.Random;
import java.util.Scanner;

/**
 * In this lab, you will write a program that plays the game Rock, Paper,
 * Scissors. The rules of the game are as follows: 1. Each player chooses Rock,
 * Paper or Scissors. 2. If both players choose the same thing, the round is a
 * tie. 3. Otherwise: a. Paper wraps Rock to win b. Scissors cut Paper to win c.
 * Rock breaks Scissors to win Your program must have the following features: 1.
 * This program will be a Java Console Application called
 * RockPaperScissorsStep1. 2. The computer asks the user for his/her choice
 * (Rock, Paper, or Scissors). a. Hint: 1 = Rock, 2 = Paper, 3 = Scissors 3.
 * After the computer asks for the user’s input, the computer randomly chooses
 * Rock, Paper, or Scissors and displays the result of the round (tie, user win,
 * or computer win). a. Hint: use the Random class.
 *
 * @author zero_cool
 */
public class RockPaperScissorsStep1 {

    public static String getUserInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    public static void main(String[] args) {

        System.out.println("Lets play rock, paper, scissors!");
        String userChoice = getUserInput("Please pick ROCK(1), PAPER(2), or SCISSORS(3)");
        int player = Integer.parseInt(userChoice);

        int rock = 1;
        int paper = 2;
        int scissors = 3;

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
