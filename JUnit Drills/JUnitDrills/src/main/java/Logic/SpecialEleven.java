/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author apprentice
 */
public class SpecialEleven {

    public boolean SpecialEleven(int n) {
        boolean result;
        if (n >= 0 && (n % 11) == 0 || (n%11)==1) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}
