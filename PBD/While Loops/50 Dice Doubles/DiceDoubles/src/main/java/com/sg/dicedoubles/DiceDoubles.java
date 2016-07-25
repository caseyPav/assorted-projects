/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dicedoubles;

import java.util.Random;

/**
 *
 * @author casey
 */
public class DiceDoubles {

    public static void main(String[] args) {

        Random generator = new Random();

        int die1 = generator.nextInt(6) + 1;
        int die2 = generator.nextInt(6) + 1;

        int total = (die1 + die2);

        while (die1 != die2) {
            System.out.println("die1 " + die1 + "die2" + die2 + "total" + total);
            if (die1 == die2) {
                System.out.println("doubles");
            }
            break;
        }
    }
}
