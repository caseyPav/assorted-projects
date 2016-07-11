package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.StateTax;
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

public class FlooringMasteryDAOStatesXML implements StatesDAOInterface {

    private ArrayList<StateTax> stateTaxList = (ArrayList<StateTax>) readInStates();

    @Override
    public List<StateTax> readInStates() {
        List<StateTax> temp = new ArrayList();
        XStream xstream = new XStream();
        File[] existingStates = new File("CompanyData/StateXML/").listFiles();
        for (File file : existingStates) {
            xstream.alias("StateTax", StateTax.class);
            StateTax o = (StateTax) xstream.fromXML(file);
            temp.add(o);
        }

        return temp;
    }

    @Override
    public boolean saveChangesToState() {

        try {
            XStream xStream = new XStream();
            OutputStream outputStream = null;
            Writer writer = null;

            for (StateTax s : getStateTaxList()) {
                try {
                    String fileName = s.toStringXML();
                    outputStream = new FileOutputStream("CompanyData/StateXML/" + fileName);
                    writer = new OutputStreamWriter(outputStream, Charset.forName("UTF-8"));
                    xStream.alias("StateTax", StateTax.class);
                    xStream.toXML(s, writer);
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
    public ArrayList<StateTax> getStateTaxList() {
        return stateTaxList;
    }

    @Override
    public void setStateTaxList(ArrayList<StateTax> stateTaxList) {
        this.stateTaxList = stateTaxList;
    }

}
