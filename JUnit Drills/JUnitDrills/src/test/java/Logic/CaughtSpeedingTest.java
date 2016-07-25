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
public class CaughtSpeedingTest {

    int speed, expected, actual;
    boolean isBirthday;

    public CaughtSpeedingTest() {
    }

    @Test
    public void CaughtSpeedingtest1() {
        speed = 60;
        isBirthday = false;
        expected = 0;
        CaughtSpeeding cs = new CaughtSpeeding();
        actual = cs.CaughtSpeeding(speed, isBirthday);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void CaughtSpeedingtest2() {
        speed = 65;
        isBirthday = false;
        expected = 1;
        CaughtSpeeding cs = new CaughtSpeeding();
        actual = cs.CaughtSpeeding(speed, isBirthday);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void CaughtSpeedingtest3() {
        speed = 65;
        isBirthday = true;
        expected = 0;
        CaughtSpeeding cs = new CaughtSpeeding();
        actual = cs.CaughtSpeeding(speed, isBirthday);
        Assert.assertEquals(expected, actual);

    }
}
