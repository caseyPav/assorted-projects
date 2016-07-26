package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.Order;
import com.sg.flooringmasteryspring.dto.Product;
import com.sg.flooringmasteryspring.dto.StateTax;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//==============================================================================//
//==============================================================================//
public class FlooringMasteryDAOProd implements FlooringMasteryInterface {

    private List<Integer> ordersToday = new ArrayList<Integer>();

    private List<Order> workingList = new ArrayList<Order>();

    private List<StateTax> stateTaxList = new ArrayList<StateTax>();

    private Map<String, Product> productList = new HashMap<String, Product>();

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
        Order toEdit = singleOrder.get(0);
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
                workingList.remove(o);
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

                        int orderNumber = Integer.parseInt(orderNumberStr);
                        double taxRate = Double.parseDouble(taxRateStr);
                        double area = Double.parseDouble(areaStr);
                        double costpsfMat = Double.parseDouble(costpsfStr);
                        double laborCostpsf = Double.parseDouble(laborpsfStr);
                        double matCost = Double.parseDouble(matCostStr);
                        double laborCost = Double.parseDouble(laborCostStr);
                        double tax = Double.parseDouble(taxStr);
                        double totalCost = Double.parseDouble(totalCostStr);
                        Order newDay = new Order(orderNumber, custName, state, taxRate, typeFloor, area, costpsfMat, laborCostpsf, matCost, laborCost, tax, totalCost, orderDate);

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
        System.out.println("works");
        return true;
    }

    @Override
    public boolean readInStates() {
  
        try (BufferedReader br = new BufferedReader(new FileReader("CompanyData/States.txt"))) {
            String fileRead = br.readLine();
            while (fileRead != null) {
                String[] tokenize = fileRead.split(",");
                String full = tokenize[0];
                String abv = tokenize[1];
                String taxRateTemp = tokenize[2];
                double taxRate = Double.parseDouble(taxRateTemp);
                StateTax toAdd = new StateTax(full, abv, taxRate);
                getStateTaxList().add(toAdd);
                fileRead = br.readLine();
                
            }
        } catch (IOException ex) {
            System.out.println("ERROR READING FROM STATE FILE");

        }
        return true;
    }

    @Override
    public boolean readInProducts() {
        HashMap<String, Product> hm = new HashMap<String, Product>();
        try (BufferedReader br = new BufferedReader(new FileReader("CompanyData/Products.txt"))) {
            String fileRead = br.readLine();
            while (fileRead != null) {
                String[] tokenize = fileRead.split(",");
                String name = tokenize[0];
                String matCostTemp = tokenize[1];
                String laborCostTemp = tokenize[2];
                double matCost = Double.parseDouble(matCostTemp);
                double laborCost = Double.parseDouble(laborCostTemp);
                Product temp1 = new Product(name, matCost, laborCost);
                getProductList().put(name, temp1);
                fileRead = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println("ERROR READING FROM PRODUCT FILE");
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

    public List<Order> getWorkingList() {
        return workingList;
    }

    public void setWorkingList(ArrayList<Order> workingList) {
        this.workingList = workingList;
    }

    public List<Integer> getOrdersToday() {
        return ordersToday;
    }

    public void setOrdersToday(List<Integer> ordersToday) {
        this.ordersToday = ordersToday;
    }

    public List<StateTax> getStateTaxList() {
        return stateTaxList;
    }

    public void setStateTaxList(List<StateTax> stateTaxList) {
        this.stateTaxList = stateTaxList;
    }

    public Map<String, Product> getProductList() {
        return productList;
    }

    public void setProductList(Map<String, Product> productList) {
        this.productList = productList;
    }





}
