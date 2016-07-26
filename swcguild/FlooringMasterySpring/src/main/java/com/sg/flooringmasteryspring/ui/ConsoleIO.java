/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ConsoleIO implements ConsoleIOInterface {
        Scanner sc = new Scanner(System.in);

    @Override
    public int promptForInt(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }

    @Override
    public int promptForIntWithRange(String prompt, int min, int max) {
        int inUserInput = 0;
        do {
            while (true) {
                try {

                    System.out.print(prompt);
                    inUserInput = Integer.parseInt(sc.nextLine());
                    break;
                } catch (InputMismatchException | NumberFormatException ex) {
                    System.out.println("INPUT NOT VALID");
                }

            }
        } while (inUserInput < min || inUserInput > max);

        return inUserInput;
    }

    @Override
    public String promptForString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    @Override
    public float promptForFloat(String prompt) {//catchline todo
        System.out.println(prompt);
        return sc.nextFloat();
    }

    @Override
    public float promptForFloatWithRange(String prompt, float min, float max) {
        float inUserInput = 0;
        do {
            System.out.println(prompt);
            inUserInput = sc.nextFloat();
        } while (inUserInput < min || inUserInput > max);
        return inUserInput;
    }

    @Override
    public double promptForDouble(String prompt) {
        System.out.print(prompt);
        double next = sc.nextDouble();
        System.out.println("");
        return next;
    }

    @Override
    public double promptForDoubleWithRange(String prompt, double min, double max) {
        double inUserInput = 0;
        do {
            try {

            System.out.println(prompt);
            inUserInput = Double.parseDouble(sc.nextLine());
            break;
            } catch (InputMismatchException | NumberFormatException ex) {
                    System.out.println("                                    ORDERS LARGER THAT 100,000 SQ FT");
                    System.out.println("                                  MUST BE PLACED BY PHONE OR IN PERSON");
                    System.out.println("                          ...assuming you didnt try to order negative area...");
                }
        } while (inUserInput < min || inUserInput > max);
        return inUserInput;
    }

    @Override
    public void promptForPrintPrompt(String prompt) {
        System.out.println(prompt);
    }

    @Override
    public void promptForPrintInt(int prompt) {
        System.out.println(prompt);
    }

    @Override
    public LocalDate promptForLocalDate(String prompt) {
        System.out.println(prompt);
        LocalDate temp = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ISO_DATE);
        return temp;
    }

    @Override
    public long promptForLong(String prompt) {
        System.out.println(prompt);
        return sc.nextLong();
    }
}
