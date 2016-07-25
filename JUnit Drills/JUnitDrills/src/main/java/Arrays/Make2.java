/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import org.apache.commons.lang.ArrayUtils;

/**
 *
 * @author apprentice
 */
public class Make2 {

    public int[] make2(int[] a, int[] b) {

        int[] both = ((int[]) ArrayUtils.addAll(a, b));
        int[] answer = {both[0], both[1]};
        return answer;
    }

}
