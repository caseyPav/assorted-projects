
package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.StateTax;
import java.util.ArrayList;
import java.util.List;


public interface StatesDAOInterface {

    ArrayList<StateTax> getStateTaxList();

    List<StateTax> readInStates();

    void setStateTaxList(ArrayList<StateTax> stateTaxList);
    
    public boolean saveChangesToState();
    
}
