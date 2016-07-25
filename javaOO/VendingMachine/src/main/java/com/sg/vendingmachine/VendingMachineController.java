/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine;

import com.sg.vendingmachine.dao.VendingMachineDAO;
import com.sg.vendingmachine.dto.InventoryList;
import com.sg.vendingmachine.ui.VendingMachineUI;
import java.io.IOException;

/**
 *
 * @author casey
 */
public class VendingMachineController {

    public void run() throws IOException {

        VendingMachineUI ui = new VendingMachineUI();
        VendingMachineDAO dao = new VendingMachineDAO();
        InventoryList inStock = dao.readInFile();

        ui.welcomeText();
        //loop make a selection or quit
        ui.listAll(inStock);
        double wallet = ui.getMoney();
        String toBuy = ui.chooseItem();
        dao.makePurchase(wallet, toBuy);
        }
    }


