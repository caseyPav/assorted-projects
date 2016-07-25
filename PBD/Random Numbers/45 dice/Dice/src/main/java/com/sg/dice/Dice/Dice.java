/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dice.Dice;

import java.util.Random;

/**
 *
 * @author casey
 */
public class Dice {
    public static void main(String[] args) {
        
                    Random generator = new Random();
                    int die1;
                    int die2;
                    int total;
do
{
          die1 = generator.nextInt(6) + 1;
          die2 = generator.nextInt(6) + 1;
          
          total = (die1 + die2);
}while (die1 != die2);
          System.out.println("total " + total + die1 +  die2);
    }
}
