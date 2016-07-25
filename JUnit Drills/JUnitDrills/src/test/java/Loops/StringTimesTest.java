/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class StringTimesTest {

    String str, expected, actual;
    int n;

    public StringTimesTest() {
    }

    @Test
    public void StringTimesTest1() {
        str = "Hi";
        n = 2;
        expected = "HiHi";
        StringTimes st = new StringTimes();
        actual = st.StringTimes(str, n);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void StringTimesTest2() {
        str = "Hi";
        n = 3;
        expected = "HiHiHi";
        StringTimes st = new StringTimes();
        actual = st.StringTimes(str, n);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void StringTimesTest3() {
        str = "Hi";
        n = 1;
        expected = "Hi";
        StringTimes st = new StringTimes();
        actual = st.StringTimes(str, n);
        Assert.assertEquals(expected, actual);

    }
}
