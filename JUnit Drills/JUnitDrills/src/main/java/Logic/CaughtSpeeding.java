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
public class CaughtSpeeding {

    public int CaughtSpeeding(int speed, boolean isBirthday) {
        int result = 0;
        if (speed > 80 && isBirthday == false) {
            result = 2;
        } else if (speed > 85 && isBirthday == true) {
            result = 2;
        } else if (speed > 60 && speed <= 80 && isBirthday == false) {
            result = 1;
        } else if (speed > 65 && speed <= 85 && isBirthday == true) {
            result = 1;
        } else {
            result = 0;
        }

        return result;
    }
}
