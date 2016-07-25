/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.alphabeticalorder;

import java.util.Scanner;

/**
 *
 * @author casey
 */
public class AlphabeticalOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;

        System.out.println("what is your last name?");
        name = sc.nextLine();

        if (name == "carswell") {
            System.out.println("soon");
        } else if (name == "jones") {
            System.out.println("soonish");
        } else if (name == "smith") {
            System.out.println("meh");
        } else if (name == "young") {
            System.out.println("ugh");
        }

    }

}
