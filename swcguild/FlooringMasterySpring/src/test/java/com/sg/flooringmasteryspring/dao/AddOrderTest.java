/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.Order;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class AddOrderTest {

    FlooringMasteryDAOProd dao;

    int expected, actual;

    public AddOrderTest() {
        
    }

    @Test
    public void addTest1() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test");
        expected = 1;
        FlooringMasteryDAOProd dao1 = new FlooringMasteryDAOProd();
        dao1.addOrder(testOrder);
        actual = dao1.getWorkingList().size();
        Assert.assertEquals(expected, actual);
    }
}
