/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class MinCatTest {

    String a, b, expected, actual;

    public MinCatTest() {
    }

    @Test
    public void MinCatTest1() {
        a = "Hello";
        b = "Hi";
        expected = "lloHi";
        MinCat q = new MinCat();
        actual = q.MinCat(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MinCatTest2() {
        a = "Hello";
        b = "java";
        expected = "ojava";
        MinCat q = new MinCat();
        actual = q.MinCat(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MinCatTest3() {
        a = "java";
        b = "Hello";
        expected = "javao";
        MinCat q = new MinCat();
        actual = q.MinCat(a, b);
        Assert.assertEquals(expected, actual);
    }
}
