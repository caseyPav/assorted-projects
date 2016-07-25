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
public class EndUpTest {

    String str, expected, actual;

    public EndUpTest() {
    }

    @Test
    public void EndUpTest1() {
        str = "Hello";
        expected = "HeLLO";
        EndUp eu = new EndUp();
        actual = eu.EndUp(str);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void EndUpTest2() {
        str = "hi there";
        expected = "hi thERE";
        EndUp eu = new EndUp();
        actual = eu.EndUp(str);
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void EndUpTest3() {
        str = "hi ";
        expected = "HI ";
        EndUp eu = new EndUp();
        actual = eu.EndUp(str);
        Assert.assertEquals(expected, actual);
    }
}
