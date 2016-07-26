/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring.dto;

/**
 *
 * @author apprentice
 */
public class Product {
    
    private String name;
    private double matCost;
    private double laborCost; 
    
    
    public Product (String name, double matCost, double laborCost){
    this.name = name;
    this.matCost = matCost;
    this.laborCost = laborCost;
    }
    
    
    
    
    @Override
    public String toString() {
        return name + "::" + Double.toString(matCost)+ "::" + Double.toString(laborCost);
    }
    
    
    
    //=========================================================================//
    //================GETTERS AND SETTERS======================================//

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMatCost() {
        return matCost;
    }

    public void setMatCost(double matCost) {
        this.matCost = matCost;
    }

    public double getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(double laborCost) {
        this.laborCost = laborCost;
    }
}
