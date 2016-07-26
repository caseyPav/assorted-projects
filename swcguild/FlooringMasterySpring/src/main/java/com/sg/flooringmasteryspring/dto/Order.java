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
public class Order {

    private int orderNum;
    private String custName;
    private String state;
    private double taxRate;
    private String typeFloor;
    private double area;
    private double costPerSqFt;
    private double laborCostPerSqFt;
    private double matCost;
    private double laborCost;
    private double tax;
    private double totalCost;
    private String orderDate;

    public Order(int orderNum, String custName, String state, double taxRate, String typeFloor, double area, double costPerSqFt, double laborCostPerSqFt, double matCost, double laborCost, double tax, double totalCost, String orderDate) {
        this.orderNum = orderNum;
        this.custName = custName;
        this.state = state;
        this.taxRate = taxRate;
        this.typeFloor = typeFloor;
        this.area = area;
        this.costPerSqFt = costPerSqFt;
        this.laborCostPerSqFt = laborCostPerSqFt;
        this.matCost = matCost;
        this.laborCost = laborCost;
        this.tax = tax;
        this.totalCost = totalCost;
        this.orderDate = orderDate;

    }

    private String CSVSafeToString(String encoded){
        String decoded = encoded.replaceAll("^%^", ",");        
        return decoded;}
    
    @Override
    public String toString() {
        return "Order Number: " + orderNum + "\nCustomer Name: " + CSVSafeToString(custName) + "  State: " + state + "  Tax Rate: " + taxRate+ "  Type of Flooring: " + typeFloor + "\nSquare Footage Required: " + area + "  Cost Per SqFt: $" + costPerSqFt + "  Labor Cost Per SqFt: $" + laborCostPerSqFt
                + "\nMaterial Cost: $" + matCost + "  Labor Cost: $" + laborCost + "  Tax Due: $" + tax + "  Total Cost: $" + totalCost + "\nDate Ordered: " + orderDate + "\n\n";
    }

    public String toStringEncoded() {
        return orderNum + "," + custName + "," + state + "," + taxRate + "," + typeFloor + "," + area + "," + costPerSqFt + "," + laborCostPerSqFt + "," + matCost + "," + laborCost + "," + tax + "," + totalCost + "," + orderDate;
    }
///==============Getters&Setters================================================///

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public String getTypeFloor() {
        return typeFloor;
    }

    public void setTypeFloor(String typeFloor) {
        this.typeFloor = typeFloor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCostPerSqFt() {
        return costPerSqFt;
    }

    public void setCostPerSqFt(double costPerSqFt) {
        this.costPerSqFt = costPerSqFt;
    }

    public double getLaborCostPerSqFt() {
        return laborCostPerSqFt;
    }

    public void setLaborCostPerSqFt(double laborCostPerSqFt) {
        this.laborCostPerSqFt = laborCostPerSqFt;
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

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

}
