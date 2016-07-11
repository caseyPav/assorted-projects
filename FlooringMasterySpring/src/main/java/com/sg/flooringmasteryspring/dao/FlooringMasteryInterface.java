package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.Order;
import java.util.ArrayList;
import java.util.List;

public interface FlooringMasteryInterface {

    List<Integer> ordersToday = new ArrayList<Integer>();
    
    List<Order> unsortedMasterList = new ArrayList<Order>();

    List<Order> workingList = new ArrayList<Order>();
    
    List<Order> canceledOrdersList = new ArrayList<Order>();

    public int addOrder(Order newOrder);

    public boolean removeOrder(String[] toRemove);

    public List<Order> getByDayList(String[] orderInfo);

    public boolean saveChangesToFile(List<Order> workingListToSave);

    public boolean readInOrders();

    public void setCurrentOrderNumber();

    public boolean sortOutCanceledOrders();

    public Order passToEdit(List<Order> singleOrder);

    public List<Order> getWorkingList();

    public void setWorkingList(ArrayList<Order> workingList);

    public List<Integer> getOrdersToday();

    public void setOrdersToday(List<Integer> ordersToday);

    public List<Order> getUnsortedMasterList();

    public void setUnsortedMasterList(List<Order> unsortedMasterList);

    public List<Order> getCanceledOrdersList();

    public void setCanceledOrdersList(List<Order> canceledOrdersList);
}
