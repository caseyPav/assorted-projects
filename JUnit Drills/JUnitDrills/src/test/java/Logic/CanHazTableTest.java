/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class CanHazTableTest {

    int yourStyle, dateStyle, expected, actual;

    public CanHazTableTest() {
    }

    @Test
    public void CanHazTableTest1() {
        yourStyle = 5;
        dateStyle = 10;
        expected = 2;
        CanHazTable cht = new CanHazTable();
        actual = cht.CanHazTable(yourStyle, dateStyle);
        Assert.assertEquals(expected, actual);

    }
        @Test
    public void CanHazTableTest2() {
        yourStyle = 5;
        dateStyle =2;
        expected = 0;
        CanHazTable cht = new CanHazTable();
        actual = cht.CanHazTable(yourStyle, dateStyle);
        Assert.assertEquals(expected, actual);

    }
        @Test
    public void CanHazTableTest3() {
        yourStyle = 5;
        dateStyle = 5;
        expected = 1;
        CanHazTable cht = new CanHazTable();
        actual = cht.CanHazTable(yourStyle, dateStyle);
        Assert.assertEquals(expected, actual);

    }
}
