/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.unitoneskillcheck;

/**
 *Create a new Java class called AreTheyTrue (make sure you create a 'main' method).
Implement a non-static method called howTrue that takes two booleans as parameters and returns a String.  The String value returned follows these rules:
Return "NEITHER” if neither input is true
Return "BOTH” if both inputs are true
Return "ONLY ONE” if only one of the inputs is true
Implement test code in your main method that calls the howTrue method.  Test with the following input values and print the results to the console:
true and true
false and false
true and false
false and true

 * @author apprentice
 */
public class AreTheyTrue {
    
    public static void main(String[] args) {
        
        howTrue(true,true);
        howTrue(false, false);
        howTrue(true, false);
        howTrue(false,true);
        
    }
    
    public static void howTrue(boolean a, boolean b){
        
        if( a == false && b == false)
            System.out.println("NEITHER");
        else if (a == true && b == false || a == false && b == true)
            System.out.println("ONLY ONE");
        else if ( a == true && b == true)
            System.out.println("BOTH");
    
    }
    
}
