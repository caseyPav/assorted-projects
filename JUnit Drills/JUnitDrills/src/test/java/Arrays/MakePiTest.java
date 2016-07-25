/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class MakePiTest {

    int n;
    int[] expected, actual;

    public MakePiTest() {
    }

    @Test
    public void MakePiTest1() {
        n = 3;
        expected = new int[]{3, 1, 4};
        MakePi mp = new MakePi();
        actual = mp.MakePi(n);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void MakePiTest2() {
        n = 14;
        expected = new int[]{3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7};
        MakePi mp = new MakePi();
        actual = mp.MakePi(n);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void MakePiTest3() {
        n = 8;
        expected = new int[]{3, 1, 4, 1, 5, 9, 2, 6};
        MakePi mp = new MakePi();
        actual = mp.MakePi(n);
        Assert.assertArrayEquals(expected, actual);
    }

}
