/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.windowmaster;

import java.util.Scanner;

/**
 *
 * @author zero_cool
 */
public class WindowMaster {
    
    final int MIN_HEIGHT = 1;
    final int MAX_HEIGHT = 25; 
    final int MIN_WIDTH = 1;
    final int MAX_WIDTH = 25;

    public static void main(String[] args) {
        float height = checkForNumber("");
        float width= 0;
        float costGlass;
        float costTrim;

        float areaOfWindow;
        float perimeterOfWindow;
        float cost;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Please enter window height");
            while (!sc.hasNextFloat()) {
                System.out.println("please enter positive number");
                sc.next(); // this is important!
            }
            height = sc.nextFloat();
        } while (height <= 0);

        do {
            System.out.println("Please enter window width");
            while (!sc.hasNextFloat()) {
                System.out.println("please enter positive number");
                sc.next(); // this is important!
            }
            width = sc.nextFloat();
        } while (width <= 0);

        do {
            System.out.println("Please enter cost of glass");
            while (!sc.hasNextFloat()) {
                System.out.println("please enter positive number");
                sc.next(); // this is important!
            }
            costGlass = sc.nextFloat();
        } while (costGlass <= 0);

        do {
            System.out.println("Please enter cost of trim");
            while (!sc.hasNextFloat()) {
                System.out.println("please enter positive number");
                sc.next(); // this is important!
            }
            costTrim = sc.nextFloat();
        } while (costTrim <= 0);

        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);

        cost = (costGlass * areaOfWindow) + (costTrim * perimeterOfWindow);

        System.out.println("Window Height = " + height);
        System.out.println("Window Width = " + width);
        System.out.println("Cost of Glass $" + costGlass);
        System.out.println("Cost of Trim $" + costTrim);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window Perimiter = " + perimeterOfWindow);
        System.out.println("Total cost = $" + cost);

    }

}




