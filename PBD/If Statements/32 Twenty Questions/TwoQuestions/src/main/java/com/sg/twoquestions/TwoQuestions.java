/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.twoquestions;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TwoQuestions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("TWO QUESTIONS!");
        System.out.println("lets play two questions");
        System.out.println("");
        System.out.println("is it (animal) (vegetable) or (mineral)?");
        String questionOne = sc.nextLine();

        System.out.println("is it (bigger) or (smaller) than a breadbox?");
        String questionTwo = sc.nextLine();

        if (questionOne == "animal") {
            if (questionTwo == "bigger") {
                System.out.println("moose. its a moose");
            }
        }
        if (questionOne == "animal") {
            if (questionTwo == "smaller") {
                System.out.println("rabbit. its a rabbit");
            }
        }
        if (questionOne == "vegetable") {
            if (questionTwo == "bigger") 
                System.out.println("i think its a watermellon");
            
        }

        if (questionOne == "vegetable") {
            if (questionTwo == "smaller") {
                System.out.println("i think its a carrot");
            }
        }
        if (questionOne == "mineral") {
            if (questionTwo == "bigger") {
                System.out.println("i thinkk its a big rock");
            }
        }
        if (questionOne == "mineral") {
            if (questionTwo == "smaller") {
                System.out.println("i think its a small rock");

            }
        }
    }

}
