/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class ParrotTroubleTest {
    
    boolean isTalking, expected, actual;
    int hour;
    public ParrotTroubleTest() {
    }
@Test
public void ParrotTrouble1(){
hour = 6;
isTalking = true;
expected = true;
ParrotTrouble pt = new ParrotTrouble();
actual = pt.ParrotTrouble(isTalking, hour);
Assert.assertEquals(expected, actual);
}
@Test
public void ParrotTrouble2(){
hour = 7;
isTalking = true;
expected = false;
ParrotTrouble pt = new ParrotTrouble();
actual = pt.ParrotTrouble(isTalking, hour);
Assert.assertEquals(expected, actual);
}
@Test
public void ParrotTrouble3(){
hour = 6;
isTalking = false;
expected = true;
ParrotTrouble pt = new ParrotTrouble();
actual = pt.ParrotTrouble(isTalking, hour);
Assert.assertEquals(expected, actual);
}
}
