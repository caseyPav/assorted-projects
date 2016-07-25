/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.fizzbuzz;

/**
 *
 * @author casey
 */
public class FizzBuzz {

    public static void main(String args[]) {

        int p;
        for (int i = 2; i < 100; i++) {
            p = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    p = 1;
                }
            }
            if (p == 0) {
                System.out.println(i);
            }
        }

    }
}
