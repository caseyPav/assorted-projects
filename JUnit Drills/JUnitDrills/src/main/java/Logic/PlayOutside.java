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
public class PlayOutside {

    public boolean PlayOutside(int temp, boolean isSummer) {
        boolean result;

        if (temp >= 60 && temp <= 90 && isSummer == false) {
            result = true;
        } else if (temp >= 60 && temp <= 100 && isSummer == true) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}
