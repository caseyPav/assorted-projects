/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.letterrevisited;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class LetterRevisited {
    

    
    	public static void main(String[] args){
            
            
                try {
                   PrintWriter writer = new PrintWriter("letter.txt");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LetterRevisited.class.getName()).log(Level.SEVERE, null, ex);
                }
		writer.println("+---------------------------------------------------------+");
		writer.println("|                                                    #### |");
		writer.println("|                                                    #### |");
		writer.println("|                                                    #### |");
		writer.println("|                                                         |");
		writer.println("|                                                         |");
		writer.println("|                                  Casey Pavelko          |");
		writer.println("|                                  26 Massachusetts Ave   |");
		writer.println("|                                  Poland, OH 44514       |");
		writer.println("|                                                         |");
		writer.println("+---------------------------------------------------------+");

                
                System.setOut(out);
	}
    
}
