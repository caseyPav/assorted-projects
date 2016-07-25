package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.StateTax;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlooringMasteryDAOStates implements StatesDAOInterface {

    private ArrayList<StateTax> stateTaxList = (ArrayList<StateTax>) readInStates();

    @Override
    public List<StateTax> readInStates() {
        List<StateTax> temp = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader("CompanyData/States.txt"))) {
            String fileRead = br.readLine();
            while (fileRead != null) {
                String[] tokenize = fileRead.split(",");
                String full = tokenize[0];
                String abv = tokenize[1];
                String taxRateTemp = tokenize[2];
                double taxRate = Double.parseDouble(taxRateTemp);
                StateTax temp1 = new StateTax(full, abv, taxRate);
                temp.add(temp1);
                fileRead = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println("ERROR READING FROM STATE FILE");

        }
        return temp;
    }

    @Override
    public ArrayList<StateTax> getStateTaxList() {
        return stateTaxList;
    }

    @Override
    public void setStateTaxList(ArrayList<StateTax> stateTaxList) {
        this.stateTaxList = stateTaxList;
    }

    @Override
    public boolean saveChangesToState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
