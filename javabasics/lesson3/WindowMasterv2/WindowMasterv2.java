/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author casey
 */
public class WindowMasterv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
	// declare variables for height and width 
	float height;
	float width;
	float costGlass;
	float costTrim;
	//declare String variables to hold the user's height and width
	//input
	String stringHeight;
	String stringWidth;
	String stringcostGlass;
	String stringcostTrim;

	//declare other variables
	float areaOfWindow;
	float cost;
	float perimeterOfWindow;

	//Declare and initize our Scanner
	Scanner sc = new Scanner(System.in);

	//Get input from user
	System.out.println("Please enter window height:");
	stringHeight = sc.nextLine();
	System.out.println("Please enter window width:");
	stringWidth = sc.nextLine();
	System.out.println("Please enter cost of glass:");
	stringcostGlass = sc.nextLine();
	System.out.println("Please enter cost of trim:");
	stringcostTrim = sc.nextLine();

	//Conver String values of height and width to floats
	height = Float.parseFloat(stringHeight);
	width = Float.parseFloat(stringWidth);
	costGlass = Float.parseFloat(stringcostGlass);
	costTrim = Float.parseFloat(stringcostTrim);

	//calculate area of window
	areaOfWindow = height * width;

	//calculate permiter of the window
	perimeterOfWindow = 2 * (height +width);

	//calculate total cost using user input
	cost = ((costGlass * areaOfWindow) + (costTrim * perimeterOfWindow));

	//print results to console
	System.out.println("Window height = " + stringHeight);
	System.out.println("Window width = " + stringWidth);
	System.out.println("Cost of Glass $" + costGlass);
	System.out.println("Cost of Trim $" + costTrim);
	System.out.println("Window area = " + areaOfWindow);
	System.out.println("Window permiter = " + perimeterOfWindow);
	System.out.println("Total Cost = $" + cost);

}
    }