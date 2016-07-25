/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class StartOzTest {

    String str, expected, actual;

    public StartOzTest() {
    }

    @Test
    public void StartOzTest1() {
        str = "ozymandias";
        expected = "oz";
        StartOz so = new StartOz();
        actual = so.StartOz(str);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void StartOzTest2() {
        str = "bzoo";
        expected = "o";
        StartOz so = new StartOz();
        actual = so.StartOz(str);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void StartOzTest3() {
        str = "oxx";
        expected = "o";
        StartOz so = new StartOz();
        actual = so.StartOz(str);
        Assert.assertEquals(expected, actual);
    }
}
