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
public class AltPairsTest {

    String str, expected, actual;

    public AltPairsTest() {
    }

    @Test
    public void AltPairsTest1() {
        str = "kitten";
        expected = "kien";
        AltPairs sh = new AltPairs();
        actual = sh.AltPairs(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AltPairsTest2() {
        str = "Chocolate ";
        expected = "Chole ";
        AltPairs sh = new AltPairs();
        actual = sh.AltPairs(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AltPairsTest3() {
        str = "CodingHorror";
        expected = "Congrr";
        AltPairs sh = new AltPairs();
        actual = sh.AltPairs(str);
        Assert.assertEquals(expected, actual);
    }
}
