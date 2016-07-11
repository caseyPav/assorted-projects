/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.Order;
import com.sg.flooringmasteryspring.dto.Product;
import com.sg.flooringmasteryspring.dto.StateTax;
import java.util.List;

public class FlooringMasteryDAOAdminMode {

    StatesDAOInterface states;
    ProductsDAOInterface products;
    FlooringMasteryInterface daoMain;

    public FlooringMasteryDAOAdminMode(StatesDAOInterface states, ProductsDAOInterface products,FlooringMasteryInterface daoMain) {
        this.states = states;
        this.products = products;
        this.daoMain = daoMain;
    }

    public boolean addProduct(Product toAdd) {
        products.getProductList().add(toAdd);
        return true;
    }

    public boolean changeStateTax(String[] toChange) {
        String state = toChange[0];
        double taxRate = Double.parseDouble(toChange[1]);
        for (StateTax s : states.getStateTaxList()) {
            if (s.getStateAbv().equalsIgnoreCase(state)) {
                s.setStateTax(taxRate);
            }
        }
        return true;
    }
    
    public List<Order> listAllCanceled(){ 
    return daoMain.getCanceledOrdersList();}

}
