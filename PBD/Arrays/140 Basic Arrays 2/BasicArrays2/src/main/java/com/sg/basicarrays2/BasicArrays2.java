/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.basicarrays2;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class BasicArrays2 {

    public static void main(String[] args) {

        Random r = new Random();
        int i1 = r.nextInt(100) + 1;
        int i2 = r.nextInt(100) + 1;
        int i3 = r.nextInt(100) + 1;
        int i4 = r.nextInt(100) + 1;
        int i5 = r.nextInt(100) + 1;
        int i6 = r.nextInt(100) + 1;
        int i7 = r.nextInt(100) + 1;
        int i8 = r.nextInt(100) + 1;
        int i9 = r.nextInt(100) + 1;
        int i10 = r.nextInt(100) + 1;

        int[] num = {i1, i2, i3, i4, i5, i6, i7, i8, i9, i10};

        for (int num1 : num) {
            System.out.println("Element = " + num1);
        }

    }
}
