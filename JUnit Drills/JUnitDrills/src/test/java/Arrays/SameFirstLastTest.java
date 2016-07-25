/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

/*
 * @author apprentice
 */
public class SameFirstLastTest {

    int[] numbers;
    boolean expected, actual;

    public SameFirstLastTest() {

    }

    @Test
    public void SameFirstLastFalse1() {
        // arr
        numbers = new int[]{1, 2, 3};
        expected = false;
        FirstLast6 fl = new FirstLast6();

        // act
        actual = fl.FirstLast6(numbers);

        // assert
        org.junit.Assert.assertEquals(expected, actual);
    }

    @Test
    public void SameFirstLastTrue1() {
        // arr
        numbers = new int[]{1, 2, 3, 1};
        expected = false;
        FirstLast6 fl = new FirstLast6();

        // act
        actual = fl.FirstLast6(numbers);

        // assert
        org.junit.Assert.assertEquals(expected, actual);

    }

    @Test
    public void SameFirstLastTrue2() {
        // arr
        numbers = new int[]{1, 2, 1};
        expected = false;
        FirstLast6 fl = new FirstLast6();

        // act
        actual = fl.FirstLast6(numbers);

        // assert
        org.junit.Assert.assertEquals(expected, actual);

    }

}
