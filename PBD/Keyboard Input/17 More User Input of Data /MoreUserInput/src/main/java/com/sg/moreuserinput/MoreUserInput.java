/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.moreuserinput;

import java.util.Scanner;

/**
 * irst name last name grade (classification) student id number login name GPA
 * (0.0 to 4.0)
 *
 * @author apprentice
 */
public class MoreUserInput {

    public static void main(String[] args) {
        System.out.println("please enter your information so i can sell it ");

        Scanner sc = new Scanner(System.in);

        System.out.println("first name ");
        String firstName = sc.nextLine();
        System.out.println("last name ");
        String lastName = sc.nextLine();
        System.out.println("grade");
        int grade = sc.nextInt();
        System.out.println("student id number");
        float studentID = sc.nextFloat();
        System.out.println("login name");
        String loginName = sc.nextLine();
        System.out.println("Gpa?");
        float gpa = sc.nextFloat();
          
        
        
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(grade);
        System.out.println(studentID);
        System.out.println(loginName);
        System.out.println(gpa);
        
        
        
        
        
        
        
    }

}
