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
public class Multiple3or5Test {

    int number;
    boolean expected, actual;

    public Multiple3or5Test() {
    }

    @Test
    public void Multiple3or5Test1() {
        number = 3;
        expected = true;
        Multiple3or5 m = new Multiple3or5();
        actual = m.Multiple3or5(number);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void Multiple3or5Test2() {
        number = 10;
        expected = true;
        Multiple3or5 m = new Multiple3or5();
        actual = m.Multiple3or5(number);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void Multiple3or5Test3() {
        number = 8;
        expected = false;
        Multiple3or5 m = new Multiple3or5();
        actual = m.Multiple3or5(number);
        Assert.assertEquals(expected, actual);

    }
}
