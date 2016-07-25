/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbookv2.dao;

import com.sg.addressbookv2.dto.Address;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface AddressBookAPI  {

    public void add(Address address);

    public void remove(String firstName, String lastName);

    public List<Address> listAll();

    public List<Address> getByLastName(String lastName);

    public List<Address> getByCity(String city);

    public List<Address> getByState(String state);

    public List<Address> getByZip(String zip);

}
