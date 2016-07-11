package com.sg.flooringmasteryspring.dto;

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
    private boolean canceled;

    public Order(int orderNum, String custName, String state, double taxRate, String typeFloor, double area, double costPerSqFt, double laborCostPerSqFt, double matCost, double laborCost, double tax, double totalCost, String orderDate, boolean canceled) {
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
        this.canceled = canceled;

    }

    @Override
    public String toString() {
        return "                          ||  Order Number: " + orderNum + "\n                          ||  Customer Name: " + custName.replace("^%^", ",") + "  State: " + state + "  Tax Rate: " + taxRate + "  Type of Flooring: " + typeFloor
                + "\n                          ||  Square Footage Required: " + area + "  Cost Per SqFt: $" + String.format("%.2f",costPerSqFt) + "  Labor Cost Per SqFt: $" + String.format("%.2f",laborCostPerSqFt)
                + "\n                          ||  Material Cost: $" + String.format("%.2f", matCost) + "  Labor Cost: $" + String.format("%.2f", laborCost) + "  Tax Due: $" + String.format("%.2f", tax) + "  Total Cost: $" + String.format("%.2f", totalCost)
                + "\n                          ||  Date Ordered: " + orderDate + "\n                          ||================================================================================================||\n";
    }

    public String toStringEncoded() {
        return orderNum + "," + custName + "," + state + "," + taxRate + "," + typeFloor + "," + area + "," + costPerSqFt + "," + laborCostPerSqFt + "," + matCost + "," + laborCost + "," + tax + "," + totalCost + "," + orderDate + "," + canceled;
    }

    public String toStringXML() {
        return orderDate + orderNum + ".xml";
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

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

}
