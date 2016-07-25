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
public abstract class Shape {
    private String color;
    
    public abstract double area();
    public abstract double perimeter();
}
