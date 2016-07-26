/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring.ui;

/**
 *
 * @author apprentice
 */
public interface FormattingUtilsInterface {

    boolean CheckProductForInStock(String input);

    boolean DateChecker(String input);

    boolean OrderNumberRangeCheck(String input);

    boolean amIaState(String input);

    boolean areaRangeCheck(String input);

    String formatState(String input);

    String nameFormatter(String input);

    String productFormatter(String input);
    
}
