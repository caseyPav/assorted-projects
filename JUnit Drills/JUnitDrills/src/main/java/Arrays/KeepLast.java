/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author apprentice
 */
public class KeepLast {

    public int[] KeepLast(int[] numbers) {
        int[] result;
        result = new int[numbers.length * 2];
        result[result.length - 1] = numbers.length - 1;
        return result;

    }

}
