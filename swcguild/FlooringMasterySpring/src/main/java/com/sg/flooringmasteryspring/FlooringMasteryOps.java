/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring;

import com.sg.flooringmasteryspring.dao.FlooringMasteryDAOProd;
import com.sg.flooringmasteryspring.dto.Order;
import com.sg.flooringmasteryspring.dto.Product;
import com.sg.flooringmasteryspring.dto.StateTax;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class FlooringMasteryOps {

    FlooringMasteryDAOProd dao;// = new FlooringMasteryDAOProd();
    public FlooringMasteryOps() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao = (FlooringMasteryDAOProd) ctx.getBean("DAOProd");

   }
    

    public Order buildOrder(Order toProcess) {

        //get tax rate
        String currentState = toProcess.getState();
        double currentTax = 0;

        for (StateTax a : dao.getStateTaxList()) {
            if (a.getStateAbv().equalsIgnoreCase(currentState)) {
                toProcess.setTaxRate(a.getStateTax());
                currentTax = a.getStateTax();
            }
        }
        //get product info
        String currentFloor = toProcess.getTypeFloor();
        Product currentProduct;
        currentProduct = dao.getProductList().get(currentFloor);
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
        //BigDecimal LaborCostRounded = BigDecimal.valueOf(preTaxTotal);
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
