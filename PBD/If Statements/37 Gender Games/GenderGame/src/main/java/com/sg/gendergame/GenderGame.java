/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.gendergame;

import java.util.Scanner;

/**
 *
 * @author casey
 */
public class GenderGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String gender, first, last;
        int age;

        System.out.println("what is your gender (m) of (f)");
        gender = sc.nextLine();
        System.out.println("First name?");
        first = sc.nextLine();
        System.out.println("Last name?");
        last = sc.nextLine();
        System.out.println("age?");
        age = sc.nextInt();

        if (gender == "f" && age < 20) {
            System.out.println("ill call you Ms. " + last);
            return;
        } else if (gender == "f" && age > 20) {
            System.out.println("ill call you Mrs. " + last);
            return;
        } else if (gender == "m") {
            System.out.println("ill call you Mr. " + last);
            return;
        }
        

    }
}
