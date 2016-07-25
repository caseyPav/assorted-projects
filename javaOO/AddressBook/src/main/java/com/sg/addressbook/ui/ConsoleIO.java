package com.sg.addressbook.ui;

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

}
