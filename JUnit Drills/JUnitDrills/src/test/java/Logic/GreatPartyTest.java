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
public class GreatPartyTest {

    int cigars;
    boolean isWeekend, expected, actual;

    public GreatPartyTest() {
    }

    @Test
    public void GreatPartyTest1() {
        cigars = 30;
        isWeekend = false;
        expected = false;
        GreatParty gp = new GreatParty();
        actual = gp.GreatParty(cigars, isWeekend);
        Assert.assertEquals(expected, actual);

    }
        @Test
    public void GreatPartyTest2() {
        cigars = 50;
        isWeekend = false;
        expected = true;
        GreatParty gp = new GreatParty();
        actual = gp.GreatParty(cigars, isWeekend);
        Assert.assertEquals(expected, actual);

    }
        @Test
    public void GreatPartyTest3() {
        cigars = 70;
        isWeekend = true;
        expected = true;
        GreatParty gp = new GreatParty();
        actual = gp.GreatParty(cigars, isWeekend);
        Assert.assertEquals(expected, actual);

    }

}
