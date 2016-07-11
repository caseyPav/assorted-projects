package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.Order;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class FlooringMasteryDAOProd implements FlooringMasteryInterface {

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

        File[] existingOrders = new File("Orders").listFiles();

        for (File file : existingOrders) {
            if (file.isFile()) {
                String filename = file.getName();

                try (BufferedReader br = new BufferedReader(new FileReader("Orders/" + filename))) {
                    String fileRead = br.readLine();
                    while (fileRead != null) {
                        String[] tokenize = fileRead.split(",");

                        String orderNumberStr = tokenize[0];
                        String custName = tokenize[1];
                        String state = tokenize[2];
                        String taxRateStr = tokenize[3];
                        String typeFloor = tokenize[4];
                        String areaStr = tokenize[5];
                        String costpsfStr = tokenize[6];
                        String laborpsfStr = tokenize[7];
                        String matCostStr = tokenize[8];
                        String laborCostStr = tokenize[9];
                        String taxStr = tokenize[10];
                        String totalCostStr = tokenize[11];
                        String orderDate = tokenize[12];
                        String canceledStr = tokenize[13];

                        int orderNumber = Integer.parseInt(orderNumberStr);

                        double taxRate = Double.parseDouble(taxRateStr);
                        double area = Double.parseDouble(areaStr);
                        double costpsfMat = Double.parseDouble(costpsfStr);
                        double laborCostpsf = Double.parseDouble(laborpsfStr);
                        double matCost = Double.parseDouble(matCostStr);
                        double laborCost = Double.parseDouble(laborCostStr);
                        double tax = Double.parseDouble(taxStr);
                        double totalCost = Double.parseDouble(totalCostStr);
                        boolean canceled = Boolean.parseBoolean(canceledStr);
                        Order newDay = new Order(orderNumber, custName, state, taxRate, typeFloor, area, costpsfMat, laborCostpsf, matCost, laborCost, tax, totalCost, orderDate, canceled);

                        getWorkingList().add(newDay);
                        fileRead = br.readLine();
                    }
                    br.close();
                } catch (IOException ex) {
                    System.out.println("ERROR READING FROM ORDER FILES");
                    System.out.println("OR THE FILE DOESN'T EXIST");
                }
            }
        }
        return true;
    }

    @Override
    public boolean saveChangesToFile(List<Order> workingListToSave) {

        try {
            List<String> datesToSave;
            datesToSave = workingListToSave.stream().map(Order::getOrderDate).distinct().collect(Collectors.toList());
            for (String date : datesToSave) {
                String fileName = "Orders_" + date + ".txt";
                try (BufferedWriter pleaseWork = new BufferedWriter(new FileWriter("Orders/" + fileName))) {
                    for (Order o : workingListToSave) {
                        if (o.getOrderDate().equals(date)) {
                            pleaseWork.write(o.toStringEncoded() + "\n");
                        }
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println("!!!!IO Exception CHANGES FAILED TO SAVE. !!!!!");
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
