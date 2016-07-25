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
public class PlayOutsideTest {

    int temp;
    boolean isSummer, expected, actual;

    public PlayOutsideTest() {
    }

    @Test
    public void PlayOutsideTest1() {
        temp = 70;
        isSummer = false;
        expected = true;
        PlayOutside po = new PlayOutside();
        actual = po.PlayOutside(temp, isSummer);
        Assert.assertEquals(expected, actual);

    }
        @Test
    public void PlayOutsideTest2() {
        temp = 95;
        isSummer = false;
        expected = false;
        PlayOutside po = new PlayOutside();
        actual = po.PlayOutside(temp, isSummer);
        Assert.assertEquals(expected, actual);

    }
        @Test
    public void PlayOutsideTest3() {
        temp = 95;
        isSummer = true;
        expected = true;
        PlayOutside po = new PlayOutside();
        actual = po.PlayOutside(temp, isSummer);
        Assert.assertEquals(expected, actual);

    }
}
