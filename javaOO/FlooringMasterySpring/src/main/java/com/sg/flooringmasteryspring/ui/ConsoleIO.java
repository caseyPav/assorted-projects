
package com.sg.flooringmasteryspring.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ConsoleIO {
        Scanner sc = new Scanner(System.in);

    public int promptForInt(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }

    public int promptForIntWithRange(String prompt, int min, int max) {
        int inUserInput = 0;
        do {
            while (true) {
                try {

                    System.out.print(prompt);
                    inUserInput = Integer.parseInt(sc.nextLine());
                    break;
                } catch (InputMismatchException | NumberFormatException ex) {
                    System.out.println("                          ||  INPUT NOT VALID");
                }

            }
        } while (inUserInput < min || inUserInput > max);

        return inUserInput;
    }

    public String promptForString(String prompt) {
        System.out.print(prompt);
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
        System.out.print(prompt);
        double next = sc.nextDouble();
        System.out.println("");
        return next;
    }

    public double promptForDoubleWithRange(String prompt, double min, double max) {
        double inUserInput = 0;
        do {
            try {

            System.out.println(prompt);
            inUserInput = Double.parseDouble(sc.nextLine());
            break;
            } catch (InputMismatchException | NumberFormatException ex) {
                    System.out.println("                          ||  INPUT NOT VALID");
                }
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
