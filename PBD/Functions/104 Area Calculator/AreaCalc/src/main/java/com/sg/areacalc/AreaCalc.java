/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.areacalc;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AreaCalc {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("lets calculate area");
        System.out.println("what shape?");
        
        int shape;
        
        System.out.println("(1)circle   (2)Rectangle    (3)Square   (4)Triangle");
        shape = sc.nextInt();
        
        if(shape ==1){
            
            
                    switch (shape) {
            case 1:
               area_circle();
                System.out.println("");
                
                break;
            case 2:
               
                break;
            case 3:
                
                break;
            default:
                break;
        }
        }
        
        

    }

    public static double area_circle(int radius) {

        int areaCircle;

        areaCircle = (int) (Math.PI * radius);
        return area_circle();

    }             // returns the area of a circle

    public static int area_rectangle(int length, int width) {

        int areaRectangle;

        areaRectangle = length * width;
        return areaRectangle;

    }

    public static int area_square(int side) {

        int areaSquare;

        areaSquare = side * side;
        return areaSquare;

    }                   // returns the area of a square

    public static double area_triangle(int base, int height) {

        int areaTriangle;

        areaTriangle = (int) (.5 * (base * height));
        return areaTriangle;

    }  // returns the area of a triangle

}
