package com.sg.addressbookv2.dao;

import com.sg.addressbookv2.dto.Address;
import com.sg.addressbookv2.dto.State;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class AddressBookUtils {

    private List<State> stateList = readInStates();

    //method to read in addresses from file 
    public List<Address> readInAddress() {
        List<Address> temp = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader("Addresses.txt"))) {
            String fileRead = br.readLine();
            while (fileRead != null) {
                String[] tokenize = fileRead.split("::");
                String firstName = tokenize[0];
                String lastName = tokenize[1];
                String street = tokenize[2];
                String city = tokenize[3];
                String state = tokenize[4];
                String zip = tokenize[5];

                String t = formatState(state);
                state = t;

                Address temp1 = new Address(nameFormatter(firstName), nameFormatter(lastName), street, city, state, zip);
                temp.add(temp1);
                fileRead = br.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(AddressBookUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

    //method to save addresses added to file
    public boolean saveAddressesToFile() {
        AddressBookIMPL i = new AddressBookIMPL();
        try (PrintWriter pw = new PrintWriter(new FileWriter("Addresses.txt"))) {
            i.getAddressList().stream().forEach((a) -> {
                pw.write(a.toStringEncoded() + "\n");
            });
        } catch (IOException ex) {
            return false;
        }
        return true;
    }

    //method to read in state name::abv list used to sanitize input data
    public List<State> readInStates() {
        List<State> temp = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader("States.txt"))) {
            String fileRead = br.readLine();
            while (fileRead != null) {
                String[] tokenize = fileRead.split("::");
                String full = tokenize[0];
                String abv = tokenize[1];
                State temp1 = new State(full, abv);
                temp.add(temp1);
                fileRead = br.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(AddressBookUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

    // convert full state names to abv
    public String formatState(String longInput) {
        String working;
        if (longInput.length() == 2) {
            return working = longInput.substring(0).toUpperCase();
        } else {
            working = nameFormatter(longInput);

            List<State> temp = getStateList().stream().filter((a) -> (a.getFull()
                    .equalsIgnoreCase(working))).collect(Collectors.toList());
            String abv = temp.get(0).getAbv();
            return abv;
        }
    }

    //string name formatter
    public String nameFormatter(String input) {
        String output = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
        return output;
    }

    //===========================================================================// 
    //===========================================================================// 
    public List<State> getStateList() {
        return stateList;
    }

    public void setStateList(List<State> stateList) {
        this.stateList = stateList;
    }
}
