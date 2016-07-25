/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.shapes.dto;

/**
 *
 * @author casey
 */
public class Rectangle extends Shape{
    
    @Override
    public double perimeter() {
        double p;
        double side1 =5;
        double side2 = 10;
        
        p = side1 + side1 + side2 + side2;
        return p;
    }

    @Override
    public double area() {
        double a;
        double side1 = 10;
        double side2 = 5;
        a = side1 * side2;
        return a;

    }
    
}
