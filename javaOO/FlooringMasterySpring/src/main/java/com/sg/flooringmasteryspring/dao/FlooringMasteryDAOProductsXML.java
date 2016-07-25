package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.Product;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FlooringMasteryDAOProductsXML implements ProductsDAOInterface {

    private ArrayList<Product> productList = (ArrayList<Product>) readInProducts();

    @Override
    public List<Product> readInProducts() {
        List<Product> temp = new ArrayList();
        XStream xstream = new XStream();
        File[] existingProducts = new File("CompanyData/ProductXML/").listFiles();
        for (File file : existingProducts) {
            xstream.alias("Product", Product.class);
            Product o = (Product) xstream.fromXML(file);
            temp.add(o);
        }
        return temp;
    }

    @Override
    public boolean saveChangesToProduct() {

        try {
            XStream xStream = new XStream();
            OutputStream outputStream = null;
            Writer writer = null;

            for (Product p : getProductList()) {
                try {
                    String fileName = p.toStringXML();
                    outputStream = new FileOutputStream("CompanyData/ProductXML/" + fileName);
                    writer = new OutputStreamWriter(outputStream, Charset.forName("UTF-8"));
                    xStream.alias("Product", Product.class);
                    xStream.toXML(p, writer);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FlooringMasteryDAOxml.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            writer.close();
            outputStream.close();
        } catch (IOException ex) {
            System.out.println("ERROR WRITING TO XML");
        }
        return true;
    }

    @Override
    public ArrayList<Product> getProductList() {
        return productList;
    }

    @Override
    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

}
