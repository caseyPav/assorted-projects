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
public class Triangle extends Shape {

    @Override
    public double area() {
        double a;
        double base = 5;
        double height = 10;
        a = (.5 * (base * height));
        return a;
    }

    @Override
    public double perimeter() {
        double p;
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;

        p = side1 + side2 + side3;

        return p;
    }

}
