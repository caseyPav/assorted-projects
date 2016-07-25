/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dto;

import java.util.ArrayList;

/**
 *
 * @author casey
 */
public class InventoryList {
        private ArrayList<Item> inventoryList = new ArrayList<Item>();

    /**
     * @return the inventoryList
     */
    public ArrayList<Item> getInventoryList() {
        return inventoryList;
    }

    /**
     * @param inventoryList the inventoryList to set
     */
    public void setInventoryList(ArrayList<Item> inventoryList) {
        this.inventoryList = inventoryList;
    }


}
