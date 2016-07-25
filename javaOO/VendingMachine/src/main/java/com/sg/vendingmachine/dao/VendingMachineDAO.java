/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.InventoryList;
import com.sg.vendingmachine.dto.Item;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author casey
 */
public class VendingMachineDAO {

    InventoryList inStock = new InventoryList();

    //read in information from file
    public InventoryList readInFile() throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader("VendingMachine.txt"))) {
            String fileRead = br.readLine();
            while (fileRead != null) {
                String[] tokenize = fileRead.split("::");
                String name = tokenize[0];
                System.out.println(tokenize[0]);
                String priceTemp = tokenize[1];
                System.out.println(tokenize[1]);
                String countTemp = tokenize[2];
                System.out.println(tokenize[2]);
                double price = Double.parseDouble(priceTemp);
                int count = Integer.parseInt(countTemp);
                Item temp = new Item(name, price, count);
                inStock.getInventoryList().add(temp);
                fileRead = br.readLine();
            }
        }
        return inStock;
    }

    //Save modified list to file
    public void saveToFile(InventoryList inStock) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("VendingMachine.txt"));
        for (Item a : inStock.getInventoryList()) {
            pw.write(a.toStringEncoded() + "\n");
        }
        pw.close();
    }

    //method to make purchase, takes wallet contents and string name 
    public boolean makePurchase(double wallet, String toBuy) {
        for (Item a : inStock.getInventoryList()) {
            if (a.getName() != null && a.getName().contains(toBuy)) {
                if (wallet >= a.getPrice()) {
                    int newCount = a.getCount() - 1;
                    a.setCount(newCount);
                    return true;
                }
            }
        }
        return false;
    }

}

