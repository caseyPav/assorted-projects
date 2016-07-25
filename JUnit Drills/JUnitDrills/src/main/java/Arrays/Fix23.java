/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author apprentice
 */
public class Fix23 {

    public int[] Fix23(int[] numbers) {

        String numList = Arrays.toString(numbers);
        int count;

        count = StringUtils.countMatches(numList, "2, 3");

        if (count != 0) {
           String numList1 = numList.replace("3", "0");

            int[] arr = Arrays.stream(numList1.substring(1, numList1.length() - 1).split(","))
                    .map(String::trim).mapToInt(Integer::parseInt).toArray();
            return arr;
        } else {
            int[] arr = Arrays.stream(numList.substring(1, numList.length() - 1).split(","))
                    .map(String::trim).mapToInt(Integer::parseInt).toArray();
            return arr;

        }

    }

}
