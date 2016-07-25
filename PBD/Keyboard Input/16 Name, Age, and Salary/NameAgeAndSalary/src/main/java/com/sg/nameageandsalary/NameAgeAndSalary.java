/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.nameageandsalary;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class NameAgeAndSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello what is your name?");
        String name = sc.nextLine();
        System.out.println("hi" + name + "how old are you?");
        String age = sc.nextLine();
        System.out.println("so youre" + age + " eh? Thats not old at all");
        System.out.println("how much do you make " + name);
        String salary = sc.nextLine();
        System.out.println( salary + "Thats it lol i hope thats per hour not per year");
    }

}
