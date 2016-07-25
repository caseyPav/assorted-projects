/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.sitelab.dao;

import org.springframework.stereotype.Repository;

/**
 * Ask the user to enter in a width, length, and the cost per 1 square foot unit
 * of flooring. Have the program calculate how much it would cost to cover the
 * area specified with the flooring. Also have the program calculate how much
 * labor costs would be, given that the average flooring team can only put in 20
 * square feet of flooring per hour at a cost of $86.00/hr with a 15-minute
 * billing increment.
 *
 * @author apprentice
 */
@Repository("floorDao")
public class FloorCalcDAO {

    public String[] runFloorCalc(double userCost, double userLength, double userWidth) {

        double area = userLength * userWidth;
        double floorCost = userCost * area;
        double laborCost = (area / 5) * 21.5d;
        double totalCost = floorCost + laborCost;

        String[] result = {Double.toString(area), Double.toString(floorCost), Double.toString(laborCost), Double.toString(totalCost)};
        return result;
    }

}
