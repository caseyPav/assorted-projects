package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.Order;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class FlooringMasteryDAOxml implements FlooringMasteryInterface {

    private List<Integer> ordersToday = new ArrayList<Integer>();

    private List<Order> unsortedMasterList = new ArrayList<Order>();

    private List<Order> workingList = new ArrayList<Order>();

    private List<Order> canceledOrdersList = new ArrayList<Order>();

    @Override
    public int addOrder(Order newOrder) {

        int orderNumber = (getOrdersToday().size() + 1);
        getOrdersToday().add(1);
        newOrder.setOrderNum(orderNumber);
        getWorkingList().add(newOrder);
        return orderNumber;
    }

    @Override
    public List<Order> getByDayList(String[] orderInfo) {

        int orderNumber = Integer.parseInt(orderInfo[1]);
        String orderDate = orderInfo[0];
        List<Order> daysOrders = getWorkingList().stream()
                .filter((a) -> (a.getOrderDate()
                        .equalsIgnoreCase(orderDate))).collect(Collectors.toList());
        if (orderNumber == -1) {
            return daysOrders;
        }
        List<Order> singleOrder = new ArrayList<Order>();
        for (Order o : daysOrders) {
            if (orderNumber == o.getOrderNum()) {
                singleOrder.add(o);
                return singleOrder;
            }
        }
        List<Order> noOrders = new ArrayList<Order>();
        return noOrders;
    }

    @Override
    public Order passToEdit(List<Order> singleOrder) {
        Order toEdit = null;
        for (Order a : singleOrder) {
            toEdit = a;
        }

        return toEdit;
    }

    @Override
    public boolean removeOrder(String[] toRemove) {

        String dateToRemoveOrder = toRemove[0];
        int orderNumber = Integer.parseInt(toRemove[1]);

        List<Order> tempRemove = getWorkingList().stream()
                .filter((a) -> (a.getOrderDate()
                        .equalsIgnoreCase(dateToRemoveOrder))).collect(Collectors.toList());
        for (Order o : tempRemove) {
            if (orderNumber == o.getOrderNum()) {
                o.setCanceled(true);
                getCanceledOrdersList().add(o);
                getWorkingList().remove(o);
                return true;
            }
        }
        return false;
    }

    @Override
    public void setCurrentOrderNumber() {
        String isToday = new SimpleDateFormat("MMddyyyy").format(Calendar.getInstance().getTime());
        List<Order> numOfSavedOrdersToday = getWorkingList().stream()
                .filter((a) -> (a.getOrderDate()
                        .equals(isToday))).collect(Collectors.toList());
        int i = 0;
        while (i++ < numOfSavedOrdersToday.size()) {
            getOrdersToday().add(i);

        }
    }

    @Override
    public boolean sortOutCanceledOrders() {

        getUnsortedMasterList().stream().forEach((o) -> {
            if (o.isCanceled() == true) {
                getCanceledOrdersList().add(o);
            } else {
                getWorkingList().add(o);
            }
        });
        return true;
    }

    @Override
    public boolean readInOrders() {
        XStream xstream = new XStream();
        File[] existingOrders = new File("OrdersXML/").listFiles();
        for (File file : existingOrders) {
            xstream.alias("Order", Order.class);
            Order o = (Order) xstream.fromXML(file);
            getUnsortedMasterList().add(o);
        }
        return true;
    }

    @Override
    public boolean saveChangesToFile(List<Order> workingListToSave) {

        try {
            XStream xStream = new XStream();
            OutputStream outputStream = null;
            Writer writer = null;

            for (Order o : workingListToSave) {
                try {
                    String fileName = "OrderXML_" + o.toStringXML();
                    outputStream = new FileOutputStream("OrdersXML/" + fileName);
                    writer = new OutputStreamWriter(outputStream, Charset.forName("UTF-8"));
                    xStream.alias("Order", Order.class);
                    xStream.toXML(o, writer);

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
    public List<Order> getWorkingList() {
        return workingList;
    }

    @Override
    public void setWorkingList(ArrayList<Order> workingList) {
        this.workingList = workingList;
    }

    @Override
    public List<Integer> getOrdersToday() {
        return ordersToday;
    }

    @Override
    public void setOrdersToday(List<Integer> ordersToday) {
        this.ordersToday = ordersToday;
    }

    @Override
    public List<Order> getUnsortedMasterList() {
        return unsortedMasterList;
    }

    @Override
    public void setUnsortedMasterList(List<Order> unsortedMasterList) {
        this.unsortedMasterList = unsortedMasterList;
    }

    @Override
    public List<Order> getCanceledOrdersList() {
        return canceledOrdersList;
    }

    @Override
    public void setCanceledOrdersList(List<Order> canceledOrdersList) {
        this.canceledOrdersList = canceledOrdersList;
    }
}
