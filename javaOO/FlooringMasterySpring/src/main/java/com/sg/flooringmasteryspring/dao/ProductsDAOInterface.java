
package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.Product;
import java.util.ArrayList;
import java.util.List;


public interface ProductsDAOInterface {

    ArrayList<Product> getProductList();

    List<Product> readInProducts();

    void setProductList(ArrayList<Product> productList);
    
    public boolean saveChangesToProduct();
    
}
