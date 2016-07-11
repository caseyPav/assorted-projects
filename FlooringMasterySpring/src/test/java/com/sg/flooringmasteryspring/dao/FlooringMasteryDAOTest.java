
package com.sg.flooringmasteryspring.dao;

import com.sg.flooringmasteryspring.dto.Order;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class FlooringMasteryDAOTest {

    FlooringMasteryDAOxml dao = new FlooringMasteryDAOxml();

    int expected, actual;
    String[] toRemove;
    String isToday = new SimpleDateFormat("MMddyyyy").format(Calendar.getInstance().getTime());

   // public FlooringMasteryDAOTest() {
      //  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
      //  dao = (FlooringMasteryDAOxml) ctx.getBean("DAOxml");

  //  }

    @Test
    public void addOrderTest1() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        expected = 1;
        dao.addOrder(testOrder);
        actual = dao.getWorkingList().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addOrderTest2() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        expected = 2;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder);
        actual = dao.getWorkingList().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addOrderTest3() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        expected = 3;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder);
        dao.addOrder(testOrder);
        actual = dao.getWorkingList().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addOrderTest4() {
        expected = 0;
        actual = dao.getWorkingList().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeOrderTest1() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        expected = 0;
        dao.addOrder(testOrder);
        toRemove = new String[]{"test", "1"};
        dao.removeOrder(toRemove);
        actual = dao.getWorkingList().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeOrderTest2() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        Order testOrder1 = new Order(2, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        expected = 1;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder1);
        toRemove = new String[]{"test", "2"};
        dao.removeOrder(toRemove);
        actual = dao.getWorkingList().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeOrderTest3() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        Order testOrder1 = new Order(2, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        expected = 1;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder1);
        toRemove = new String[]{"test", "1"};
        dao.removeOrder(toRemove);
        actual = dao.getWorkingList().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchOrderByDateTest1() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        Order testOrder1 = new Order(2, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        Order testOrder2 = new Order(3, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        Order testOrder3 = new Order(4, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        expected = 4;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder1);
        dao.addOrder(testOrder2);
        dao.addOrder(testOrder3);
        toRemove = new String[]{"test", "-1"};
        actual = dao.getByDayList(toRemove).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchOrderByDateTest2() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder1 = new Order(2, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder2 = new Order(3, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        Order testOrder3 = new Order(4, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        expected = 2;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder1);
        dao.addOrder(testOrder2);
        dao.addOrder(testOrder3);
        toRemove = new String[]{"date2", "-1"};
        actual = dao.getByDayList(toRemove).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchOrderByDateTest3() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder1 = new Order(2, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder2 = new Order(3, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder3 = new Order(4, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        expected = 3;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder1);
        dao.addOrder(testOrder2);
        dao.addOrder(testOrder3);
        toRemove = new String[]{"date2", "-1"};
        actual = dao.getByDayList(toRemove).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchOrderByDateTest4() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder1 = new Order(2, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder2 = new Order(3, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder3 = new Order(4, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        expected = 1;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder1);
        dao.addOrder(testOrder2);
        dao.addOrder(testOrder3);
        toRemove = new String[]{"test", "-1"};
        actual = dao.getByDayList(toRemove).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchOrderByDateAndNumberTest1() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder1 = new Order(2, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder2 = new Order(3, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder3 = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "test",false);
        expected = 1;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder1);
        dao.addOrder(testOrder2);
        dao.addOrder(testOrder3);
        toRemove = new String[]{"date2", "1"};
        actual = dao.getByDayList(toRemove).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchOrderByDateAndNumberTest2() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder1 = new Order(2, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder2 = new Order(3, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder3 = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date1",false);
        expected = 1;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder1);
        dao.addOrder(testOrder2);
        dao.addOrder(testOrder3);
        toRemove = new String[]{"date2", "2"};
        actual = dao.getByDayList(toRemove).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchOrderByDateAndNumberTest3() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder1 = new Order(2, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder2 = new Order(3, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder3 = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date1",false);
        expected = 1;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder1);
        dao.addOrder(testOrder2);
        dao.addOrder(testOrder3);
        toRemove = new String[]{"date2", "3"};
        actual = dao.getByDayList(toRemove).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchOrderByDateAndNumberTest4() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder1 = new Order(2, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder2 = new Order(3, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date2",false);
        Order testOrder3 = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, "date1",false);
        expected = 0;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder1);
        dao.addOrder(testOrder2);
        dao.addOrder(testOrder3);
        toRemove = new String[]{"date1", "2"};
        actual = dao.getByDayList(toRemove).size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setOrderNumberTest1() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, isToday,false);
        Order testOrder1 = new Order(2, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, isToday,false);
        Order testOrder2 = new Order(3, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, isToday,false);
        Order testOrder3 = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, isToday,false);
        expected = 4;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder1);
        dao.addOrder(testOrder2);
        dao.addOrder(testOrder3);
        actual = dao.getOrdersToday().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setOrderNumberTest2() {
        Order testOrder = new Order(1, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, isToday,false);
        Order testOrder1 = new Order(2, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, isToday,false);
        Order testOrder2 = new Order(3, "test", "test", 1, "", 1, 1, 1, 1, 1, 1, 1, isToday,false);
        expected = 3;
        dao.addOrder(testOrder);
        dao.addOrder(testOrder1);
        dao.addOrder(testOrder2);
        actual = dao.getOrdersToday().size();
        Assert.assertEquals(expected, actual);
    }

}
