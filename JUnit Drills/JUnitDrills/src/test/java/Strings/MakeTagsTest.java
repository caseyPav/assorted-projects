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
public class MakeTagsTest {

    String tag, content, expected, actual;

    public MakeTagsTest() {
    }

    @Test
    public void MakeTagsTest1() {
        tag = "i";
        content = "Yay";
        expected = "<i>Yay</i>";
        MakeTags q = new MakeTags();
        actual = q.MakeTags(tag, content);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MakeTagsTest2() {
        tag = "i";
        content = "Hello";
        expected = "<i>Hello</i>";
        MakeTags q = new MakeTags();
        actual = q.MakeTags(tag, content);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void MakeTagsTest3() {
        tag = "cite";
        content = "Yay";
        expected = "<cite>Yay</cite>";
        MakeTags q = new MakeTags();
        actual = q.MakeTags(tag, content);
        Assert.assertEquals(expected, actual);
    }
}
