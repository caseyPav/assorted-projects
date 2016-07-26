/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.Order;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface FlooringMasteryInterface {

    public int addOrder(Order newOrder);

    public boolean removeOrder(String[] toRemove);

    public boolean readInStates();

    public boolean readInProducts();

    public List<Order> getByDayList(String[] orderInfo);

    public boolean saveChangesToFile(List<Order> workingListToSave);

    public boolean readInOrders();

    public void setCurrentOrderNumber();

    public Order passToEdit(List<Order> singleOrder);

}
