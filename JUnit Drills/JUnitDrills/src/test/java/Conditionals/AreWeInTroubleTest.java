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
public class AreWeInTroubleTest {
    boolean aSmile, bSmile, expected, actual;
    
    @Test
    public void AreWeInTroubleTest1() {
        
        aSmile = true;
        bSmile = true;
        expected = true;
        AreWeInTrouble awit = new AreWeInTrouble();
        actual = awit.AreWeInTrouble(aSmile, bSmile);
        Assert.assertEquals(expected, actual);
        
    }
    @Test
    public void AreWeInTroubleTest2() {
        
        aSmile = false;
        bSmile = false;
        expected = true;
        AreWeInTrouble awit = new AreWeInTrouble();
        actual = awit.AreWeInTrouble(aSmile, bSmile);
        Assert.assertEquals(expected, actual);
        
    }
    @Test
    public void AreWeInTroubleTest3() {
        
        aSmile = true;
        bSmile = false;
        expected = false;
        AreWeInTrouble awit = new AreWeInTrouble();
        actual = awit.AreWeInTrouble(aSmile, bSmile);
        Assert.assertEquals(expected, actual);
        
    }
}
