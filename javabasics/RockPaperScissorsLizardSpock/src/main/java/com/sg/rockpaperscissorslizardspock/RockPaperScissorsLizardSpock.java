/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.rockpaperscissorslizardspock;

import java.util.Random;
import java.util.Scanner;

/**
 * to do: add lizard and spock into the mix...
 *
 * @author casey
 */
public class RockPaperScissorsLizardSpock {


    public static void main(String[] args) {

        System.out.println("Lets play rock, paper, scissors, lizard, spock!");

        Boolean replay = true;
        do {
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
            int lizard = 4;
            int spock = 5;
            int computerScore = 0;
            int myScore = 0;
            int tie = 0;

            for (loop = 0; loop < rounds; loop++) {

                String userChoice = getUserInput("Please pick ROCK(1), PAPER(2), SCISSORS(3), LIZARD(4), or SPOCK(5)");
                int player = Integer.parseInt(userChoice);

                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(5 - 1 + 1) + 1;

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
                    } else if (player == lizard) {
                        System.out.println("You chose LIZARD. Computer chose ROCK: YOU LOSE");
                        computerScore = computerScore + 1;
                    } else if (player == spock) {
                        System.out.println("You chose SPOCK. Computer chose ROCK: YOU WIN");
                        myScore = myScore + 1;
                    }
                    
                    /*
                    public static void rockLogic()
                    */

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
                    } else if (player == lizard) {
                        System.out.println("You chose LIZARD. Computer chose PAPER: YOU WIN");
                        myScore = myScore + 1;
                    } else if (player == spock) {
                        System.out.println("You chose SPOCK. Computer chose PAPER: YOU LOSE");
                        computerScore = computerScore + 1;
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
                    } else if (player == lizard) {
                        System.out.println("You chose LIZARD. Computer chose SCISSORS: YOU LOSE");
                        computerScore = computerScore + 1;
                    } else if (player == spock) {
                        System.out.println("You chose SPOCK. Computer chose SCISSORS: YOU WIN");
                        myScore = myScore + 1;
                    }

                } else if (randomNumber == lizard) {
                    if (player == rock) {
                        System.out.println("You chose ROCK. Computer chose LIZARD: You WIN");
                        myScore = myScore + 1;
                    } else if (player == paper) {
                        System.out.println("You chose PAPER. Computer chose LIZARD: YOU LOSE");
                        computerScore = computerScore + 1;
                    } else if (player == scissors) {
                        System.out.println("You chose SCISSORS. Computer chose LIZARD: You WIN");
                        myScore = myScore + 1;
                    } else if (player == lizard) {
                        System.out.println("You chose LIZARD. Computer chose LIZARD: YOU TIE");
                        tie = tie + 1;
                    } else if (player == spock) {
                        System.out.println("You chose SPOCK. Computer chose LIZARD: YOU LOSE");
                        computerScore = computerScore + 1;
                    }
                } else if (randomNumber == spock) {
                    if (player == rock) {
                        System.out.println("You chose ROCK. Computer chose SPOCK: You LOSE");
                        computerScore = computerScore + 1;
                    } else if (player == paper) {
                        System.out.println("You chose PAPER. Computer chose SPOCK: YOU WIN");
                        myScore = myScore + 1;
                    } else if (player == scissors) {
                        System.out.println("You chose SCISSORS. Computer chose SPOCK: You LOSE");
                        computerScore = computerScore + 1;
                    } else if (player == lizard) {
                        System.out.println("You chose LIZARD. Computer chose SPOCK: You WIN");
                        myScore = myScore + 1;
                    } else if (player == spock) {
                        System.out.println("You chose SPOCK. Computer chose SPOCK: TIE");
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
            String userChoice = getUserInput("Would you like to play again (1)YES (2)NO");
            int replaySelect = Integer.parseInt(userChoice);
            if (replaySelect == 1) {
                replay = true;
            } else if (replaySelect == 2) {
                replay = false;
                System.out.println("Thanks for Playing!");
                return;
            }

        } while (replay = true);

    }

    public static String getUserInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }
}
