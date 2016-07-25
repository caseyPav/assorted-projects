/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import org.apache.commons.lang.StringUtils;
import java.util.Arrays;

/**
 *
 * @author apprentice
 */
public class Double23 {

    public boolean Double23(int[] numbers) {
        
        String numList = Arrays.toString(numbers);
        int count2;
        int count3;
        count2 = StringUtils.countMatches(numList, "2");
        count3 = StringUtils.countMatches(numList, "3");

        if (count2 == 2 || count3 == 2) {
            return true;
        } else {
            return false;
        }

    }
}
