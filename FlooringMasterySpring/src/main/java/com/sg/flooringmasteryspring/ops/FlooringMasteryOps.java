package com.sg.flooringmasteryspring.ops;

import com.sg.flooringmasteryspring.dao.ProductsDAOInterface;
import com.sg.flooringmasteryspring.dao.StatesDAOInterface;
import com.sg.flooringmasteryspring.dto.Order;
import com.sg.flooringmasteryspring.dto.Product;
import com.sg.flooringmasteryspring.dto.StateTax;

public class FlooringMasteryOps {

    StatesDAOInterface states;
    ProductsDAOInterface products;

    public FlooringMasteryOps(ProductsDAOInterface products, StatesDAOInterface states) {
        this.products = products;
        this.states = states;
    }

    public Order buildOrder(Order toProcess) {
        //get tax rate
        String currentState = toProcess.getState();
        double currentTax = 0;

        for (StateTax a : states.getStateTaxList()) {
            if (a.getStateAbv().equalsIgnoreCase(currentState)) {
                toProcess.setTaxRate(a.getStateTax());
                currentTax = a.getStateTax();
            }
        }
        //get product info
        String currentFloor = toProcess.getTypeFloor();
        Product currentProduct = null;
        for (Product a : products.getProductList()) {
            if (a.getName().equalsIgnoreCase(currentFloor)) {
                currentProduct = a;
            }
        }
        double currentMatCpsf = currentProduct.getMatCost();
        double currentLaborCpsf = currentProduct.getLaborCost();

        //math to get remaining order fields
        double currentArea = toProcess.getArea();
        double currentMatTotal = (currentMatCpsf * currentArea);
        double currentLaborTotal = (currentLaborCpsf * currentArea);
        double preTaxTotal = (currentMatTotal + currentLaborTotal);
        double currentTaxTotal = (preTaxTotal * currentTax);
        double currentTotal = (preTaxTotal + currentTaxTotal);

        //set all order properties other than order #
        toProcess.setCostPerSqFt(currentMatCpsf);
        toProcess.setLaborCostPerSqFt(currentLaborCpsf);
        toProcess.setMatCost(currentMatTotal);
        toProcess.setLaborCost(currentLaborTotal);
        toProcess.setTax(currentTaxTotal);
        toProcess.setTotalCost(currentTotal);
        return toProcess;
    }

    public Order editOrder(Order toEdit, String[] newFields) {
        String newName = newFields[0];
        String newState = newFields[1];
        String newProduct = newFields[2];
        String newArea = newFields[3];
        if (!"".equals(newName)) {
            toEdit.setCustName(newName);
        }
        if (!"".equals(newState)) {
            toEdit.setState(newState);
        }
        if (!"".equals(newProduct)) {
            toEdit.setTypeFloor(newProduct);
        }
        if (!"".equals(newArea)) {
            double area = Double.parseDouble(newArea);
            toEdit.setArea(area);
        }
        return toEdit;
    }

}
