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
public class CanHazTable {

    public int CanHazTable(int yourStyle, int dateStyle) {
        int result = 0;
        if (yourStyle >= 8 || dateStyle >= 8) {
            result = 2;
        } else if (yourStyle + dateStyle >= 8) {
            result = 1;
        } else if (yourStyle + dateStyle <= 2) {
            result = 0;
        }
        return result;
    }
}
