/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine;

import java.io.IOException;

/**
 *
 * @author casey
 */
public class VendingMachineApp {
    public static void main(String[] args) throws IOException {
        VendingMachineController vmc = new VendingMachineController();
    
   vmc.run();
    }
    
}
