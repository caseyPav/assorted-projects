package com.sg.addressbookv2.dao;

import com.sg.addressbookv2.dto.Address;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBookIMPL implements AddressBookAPI {

    AddressBookUtils io = new AddressBookUtils();

    private List<Address> AddressList = io.readInAddress();

    @Override
    public void add(Address address) {
        getAddressList().add(address);
    }

    @Override
    public void remove(String firstName, String lastName) {
        Address temp = null;
        for (Address a : getAddressList()) {
            if (a.getFirstName().equalsIgnoreCase(firstName)
                    && a.getLastName().equalsIgnoreCase(lastName)) {
                temp = a;
            }
        }
        getAddressList().remove(temp);
    }

    @Override
    public List<Address> listAll() {
        return getAddressList();
    }

    @Override
    public List<Address> getByLastName(String lastName) {
        return getAddressList().stream()
                .filter((a) -> (a.getLastName()
                        .equalsIgnoreCase(lastName))).collect(Collectors.toList());
    }

    @Override
    public List<Address> getByCity(String city) {
        return getAddressList().stream()
                .filter((a) -> (a.getCity()
                        .equalsIgnoreCase(city))).collect(Collectors.toList());
    }

    @Override
    public List<Address> getByState(String state) {
        String stateFormatted;
        if (state.length() > 2) {
            stateFormatted = io.formatState(state);
        } else {
            stateFormatted = state.toUpperCase();
        }
        return getAddressList().stream()
                .filter((a) -> (a.getState()
                        .equalsIgnoreCase(stateFormatted))).sorted((a1, a2) -> a1.getCity().compareTo(a2.getCity()))
                .collect(Collectors.toList());

    }

    @Override
    public List<Address> getByZip(String zip) {
        return getAddressList().stream()
                .filter((a) -> (a.getZip()
                        .equalsIgnoreCase(zip))).collect(Collectors.toList());
    }

    //===========================================================================// 
    //===========================================================================// 
    public List<Address> getAddressList() {
        return AddressList;
    }

    public void setAddressList(List<Address> AddressList) {
        this.AddressList = AddressList;
    }

}
