package com.sg.flooringmasteryspring.dto;

public class Product {

    private String name;
    private double matCost;
    private double laborCost;

    public Product(String name, double matCost, double laborCost) {
        this.name = name;
        this.matCost = matCost;
        this.laborCost = laborCost;
    }

    @Override
    public String toString() {
        return "                          ||  " + name;
    }

    public String toStringXML() {
        return name + ".xml";
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
