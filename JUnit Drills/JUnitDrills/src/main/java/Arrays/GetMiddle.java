/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 * Given 2 int arrays, a and b, each length 3, return a new array length 2
 * containing their middle elements.  *
 * GetMiddle({1, 2, 3}, {4, 5, 6}) -> {2, 5} GetMiddle({7, 7, 7}, {3, 8, 0}) ->
 * {7, 8} GetMiddle({5, 2, 9}, {1, 4, 5}) -> {2, 4}
 *
 *
 * @author apprentice
 */
public class GetMiddle {

    public int[] GetMiddle(int[] a, int[] b) {

        int[] export;
        export = new int[]{a[1], b[1]};

        return export;

    }

}
