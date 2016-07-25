/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.interestcalc;

import java.util.Scanner;

/**
 * Requirements In this lab, you will write an interest calculator program that
 * works as described in this example: John has $500 to invest. Sue knows of a
 * mutual fund plan that pays 10% interest annually, compounded quarterly. That
 * is, every three months, the principal is multiplied by 2.5% (the 10% annual
 * rate divided by 4 because it is compounded 4 times per year) and the result
 * is added to the principal. More generally, the new amount each quarter is
 * equal to: CurrentBalance * (1 + (QuarterlyInterestRate / 100)) Your
 * assignment is to write a program that will tell John how much money will be
 * in the fund after 20 years. Make the program general, that is, it should take
 * as inputs the following: 1. Annual interest rate 2. Initial amount of
 * principal 3. The number of years the money is to stay in the fund The output
 * should include the following for each year: 1. The year number 2. The
 * principal at the beginning of the year 3. The total amount of interest earned
 * for the year 4. The principal at the end of the year Additional Challenge: 1.
 * Change the program so that interest is compounded monthly. 2. Change the
 * program so that the user can choose from quarterly, monthly, or daily
 * interest compound periods.
 *
 * @author casey
 */
public class interestCalc {

    public static void main(String[] args) {

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
    }

}
