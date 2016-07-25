/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.grades;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Grades {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new FileWriter("grades.txt"));

        String name;

        System.out.println("Please enter your name");
        name = sc.nextLine();
        out.println(name);

        int[] grades = new int[6];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (int) (Math.random() * 100);
        
            System.out.println("here are your grades ");
            System.out.println("grade 1" + grades[0]);
            System.out.println("grade 1" + grades[1]);
            System.out.println("grade 1" + grades[2]);
            System.out.println("grade 1" + grades[3]);
            System.out.println("grade 1" + grades[5]);
            
            out.write(Integer.toString(grades[i]));
            out.flush();
            out.close();
        }
    }

    }
