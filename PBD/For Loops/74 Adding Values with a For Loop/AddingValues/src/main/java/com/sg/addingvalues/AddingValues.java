/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addingvalues;

import java.util.Scanner;

/**
 *
 * @author casey
 */
public class AddingValues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int user;
        int total;

        System.out.println("im a thing that will add numbers together. hello.");
        System.out.println("you can call me ralph");
        System.out.println("Give me a number to add to ");
        user = sc.nextInt();

        
        for( int n = 1; n <= user; n = n + 1 ){
            total = n + n;
            System.out.println(n);
            System.out.println("total is " + total);
                    
        }
            
       

    }
}
