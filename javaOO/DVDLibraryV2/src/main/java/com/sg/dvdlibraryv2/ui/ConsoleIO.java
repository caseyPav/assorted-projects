/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryv2.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ConsoleIO {

    Scanner sc = new Scanner(System.in);

    public int promptForInt(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }

    public int promptForIntWithRange(String prompt, int min, int max) {
        int inUserInput = 0;
        do {
            System.out.println(prompt);
            inUserInput = sc.nextInt();
        } while (inUserInput < min || inUserInput > max);
        return inUserInput;
    }

    public String promptForString(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();
    }

    public float promptForFloat(String prompt) {
        System.out.println(prompt);
        return sc.nextFloat();
    }

    public float promptForFloatWithRange(String prompt, float min, float max) {
        float inUserInput = 0;
        do {
            System.out.println(prompt);
            inUserInput = sc.nextFloat();
        } while (inUserInput < min || inUserInput > max);
        return inUserInput;
    }

    public double promptForDouble(String prompt) {
        System.out.println(prompt);
        return sc.nextDouble();
    }

    public double promptForDoubleWithRange(String prompt, double min, double max) {
        double inUserInput = 0;
        do {
            System.out.println(prompt);
            inUserInput = sc.nextDouble();
        } while (inUserInput < min || inUserInput > max);
        return inUserInput;
    }

    public void promptForPrintPrompt(String prompt) {
        System.out.println(prompt);
    }

    public void promptForPrintInt(int prompt) {
        System.out.println(prompt);
    }

    public LocalDate promptForLocalDate(String prompt) {
        System.out.println(prompt);
        LocalDate temp = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ISO_DATE);
        return temp;
    }

    public long promptForLong(String prompt) {
        System.out.println(prompt);
        return sc.nextLong();
    }
}
