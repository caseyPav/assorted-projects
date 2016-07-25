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
public class InsertWordTest {
    String word, container, expected,actual;
    public InsertWordTest() {
    }

        @Test
    public void InsetWordTest1() {
        word = "Yay";
        container = "<<>>";
        expected = "<<Yay>>";
        InsertWord q = new InsertWord();
        actual = q.InsertWord(word, container);
        Assert.assertEquals(expected, actual);
    }
            @Test
    public void InsetWordTest2() {
        word = "WooHoo";
        container = "<<>>";
        expected = "<<WooHoo>>";
        InsertWord q = new InsertWord();
        actual = q.InsertWord(word, container);
        Assert.assertEquals(expected, actual);
    }
            @Test
    public void InsetWordTest3() {
        word = "word";
        container = "[[]]";
        expected = "[[word]]";
        InsertWord q = new InsertWord();
        actual = q.InsertWord(word, container);
        Assert.assertEquals(expected, actual);
    }
}
