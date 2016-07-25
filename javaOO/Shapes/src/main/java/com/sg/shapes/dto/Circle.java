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
public class Circle extends Shape {

    @Override
    public double area() {
        double a;
        double radius = 10;
        a = (3.14 * (radius * radius));
        return a;

    }

    @Override
    public double perimeter() {
        double p;
        double radius = 10;
        p = (2 * 3.14 * radius);
        return p;
    }

}
