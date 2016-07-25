/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dto;

/**
 *
 * @author casey
 */
public class Item {
    private String name;
    private double price;
    private int count;
    
    public Item(String name, double price, int count){
    this.name = name;
    this.price = price;
    this.count = count;
    
    }
    
    @Override
    public String toString(){
    return name + "" + Double.toString(price) + "" + Integer.toString(count);}
    
    public String toStringEncoded(){
    return name + "::" + Double.toString(price) + "::" + Integer.toString(count);}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
    
}
