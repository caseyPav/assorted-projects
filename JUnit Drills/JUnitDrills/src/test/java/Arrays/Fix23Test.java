/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import com.sun.deploy.uitoolkit.impl.fx.FXWindow;
import com.sun.deploy.uitoolkit.impl.fx.FXWindowFactory;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class Fix23Test {

    int[] numbers, expected, actual;

    public Fix23Test() {
    }

    @Test
    public void Fix23Test1() {
        numbers = new int[]{1, 2, 3};
        expected = new int[]{1, 2, 0};
        Fix23 f = new Fix23();
        actual = f.Fix23(numbers);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void Fix23Test2() {
        numbers = new int[]{2, 3, 5};
        expected = new int[]{2, 0, 5};
        Fix23 f = new Fix23();
        actual = f.Fix23(numbers);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void Fix23Test3() {
        numbers = new int[]{1, 2, 1};
        expected = new int[]{1, 2, 1};
        Fix23 f = new Fix23();
        actual = f.Fix23(numbers);
        Assert.assertArrayEquals(expected, actual);
    }
}
