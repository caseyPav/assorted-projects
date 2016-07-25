/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.shapes;

import com.sg.shapes.dto.*;
import com.sg.shapes.dto.Circle;
import com.sg.shapes.dto.Rectangle;
import com.sg.shapes.dto.Square;

/**
 *
 * @author casey
 */
public class ShapeController {

    public static void main(String[] args) {

        Shape ns = new Square();
        System.out.println("SQUARE");
        System.out.println("======");
        System.out.println("Area is: " + ns.area());
        System.out.println("Perimeter is: " + ns.perimeter());

        Shape nr = new Rectangle();
        System.out.println("RECTANGLE");
        System.out.println("=========");
        System.out.println("Area is: " + nr.area());
        System.out.println("Perimeter is: " + nr.perimeter());

        Shape nc = new Circle();
        System.out.println("CIRCLE");
        System.out.println("======");
        System.out.println("Area is: " + nc.perimeter());
        System.out.println("Circumference is: " + nc.area());

        Shape nt = new Triangle();
        System.out.println("TRIANGLE");
        System.out.println("========");
        System.out.println("Area Is: " + nt.area());
        System.out.println("Perimeter Is: " + nt.perimeter());

    }

}
