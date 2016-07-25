/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class FirstLast6Test {

    int[] numbers;
    boolean expected, actual;

    public FirstLast6Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void FirstLast6TestTrue1() {
        // arr
        numbers = new int[]{1, 2, 6};
        expected = true;
        FirstLast6 fl = new FirstLast6();

        // act
       actual = fl.FirstLast6(numbers);

        // assert
        org.junit.Assert.assertEquals(expected, actual);
    }

    @Test
    public void FirstLast6TestTrue2() {
        // arr
        numbers = new int[]{6, 1, 2, 3};
        expected = true;
        FirstLast6 fl = new FirstLast6();

        // act
       actual = fl.FirstLast6(numbers);

        // assert
        org.junit.Assert.assertEquals(expected, actual);
    }

    @Test
    public void FirstLast6TestFalse() {
        // arr
        numbers = new int[]{13, 6, 1, 2, 3};
        expected = false;
        FirstLast6 fl = new FirstLast6();

        // act
        actual = fl.FirstLast6(numbers);

        // assert
        org.junit.Assert.assertEquals(expected, actual);
    }
}
