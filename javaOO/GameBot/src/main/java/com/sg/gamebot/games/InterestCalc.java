/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.gamebot.games;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class InterestCalc implements GameInterface{

    @Override
    public String ReturnName() {
        return "INTEREST CALCULATOR GAME: really fun.. enter 'ic' to play";
    }

    @Override
    public boolean Run() {
                Scanner sc = new Scanner(System.in);

        System.out.println("Compound Interest Calculator");
        System.out.println("Please enter the annual interest rate");
        double interestRate = sc.nextDouble();
        System.out.println("How much money are you investing?");
        double principal = sc.nextDouble();
        System.out.println("How many years will you be investing for?");
        int length = sc.nextInt();
        //System.out.println("Is interest compounded QUATERLY(1), MONTHLY(2), or DAILY(3)");
        //int timeToCompound = sc.nextInt();

        int startYear = 2016;
        int trackYears = 0;
        int loops = length * 4;

        double currentBalance = principal;

        for (int count = 0; count <= loops; count++) {

            currentBalance = currentBalance * (1 + ((interestRate / 4d) / 100d));

            if (count % 4 == 0) {
                double interestEarned = currentBalance - principal;
                principal = currentBalance;
                double currentBalanceRoundOff = Math.round(currentBalance * 100.0) / 100.0;
                double interestEarnedRoundOff = Math.round(interestEarned * 100.0) / 100.0;

                trackYears = trackYears + 1;
                System.out.println("year " + (startYear + trackYears));
                System.out.print("currentbalance  $" + currentBalanceRoundOff);
                System.out.print("      interest earned $" + interestEarnedRoundOff);
                System.out.println("\n");
            }

        }
    return true;}
    
}
