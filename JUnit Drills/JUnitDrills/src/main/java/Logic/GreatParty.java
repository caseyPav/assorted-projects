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
public class GreatParty {

    public boolean GreatParty(int cigars, boolean isWeekend) {
        boolean result;

        if (cigars >= 40 && isWeekend == true) {
            result = true;
        } else if (cigars >= 40 && cigars <= 60 && isWeekend == false) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
