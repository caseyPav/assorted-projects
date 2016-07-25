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
public class Square extends Shape {

    @Override
    public double perimeter() {
        double p;
        double side = 10;
        p = side + side + side + side;
        return p;
    }

    @Override
    public double area() {
        double a;
        double side = 10;
        a = side * side;
        return a;

    }
}
