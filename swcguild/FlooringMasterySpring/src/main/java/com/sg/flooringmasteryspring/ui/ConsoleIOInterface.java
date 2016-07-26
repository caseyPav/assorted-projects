/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring.ui;

import java.time.LocalDate;

/**
 *
 * @author apprentice
 */
public interface ConsoleIOInterface {

    double promptForDouble(String prompt);

    double promptForDoubleWithRange(String prompt, double min, double max);

    float promptForFloat(String prompt);

    float promptForFloatWithRange(String prompt, float min, float max);

    int promptForInt(String prompt);

    int promptForIntWithRange(String prompt, int min, int max);

    LocalDate promptForLocalDate(String prompt);

    long promptForLong(String prompt);

    void promptForPrintInt(int prompt);

    void promptForPrintPrompt(String prompt);

    String promptForString(String prompt);
    
}
