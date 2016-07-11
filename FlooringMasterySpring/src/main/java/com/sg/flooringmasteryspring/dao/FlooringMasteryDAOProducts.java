package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlooringMasteryDAOProducts implements ProductsDAOInterface {

    private ArrayList<Product> productList = (ArrayList<Product>) readInProducts();

    @Override
    public List<Product> readInProducts() {
        List<Product> temp = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader("CompanyData/Products.txt"))) {
            String fileRead = br.readLine();
            while (fileRead != null) {
                String[] tokenize = fileRead.split(",");
                String name = tokenize[0];
                String matCostTemp = tokenize[1];
                String laborCostTemp = tokenize[2];
                double matCost = Double.parseDouble(matCostTemp);
                double laborCost = Double.parseDouble(laborCostTemp);
                Product temp1 = new Product(name, matCost, laborCost);
                temp.add(temp1);
                fileRead = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println("ERROR READING FROM PRODUCT FILE");
        }
        return temp;
    }

    @Override
    public ArrayList<Product> getProductList() {
        return productList;
    }

    @Override
    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean saveChangesToProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
