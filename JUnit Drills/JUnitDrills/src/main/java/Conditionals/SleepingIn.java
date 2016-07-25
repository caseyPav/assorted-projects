/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

/**
 * The parameter weekday is true if it is a weekday, and the parameter vacation
 * is true if we are on vacation. We sleep in if it is not a weekday or we're on
 * vacation. Return true if we sleep in.  *
 * sleepIn(false, false) -> true sleepIn(true, false) -> false sleepIn(false,
 * true) -> true
 *
 *
 *
 *
 * @author apprentice
 */
public class SleepingIn {

    public boolean CanSleepIn(boolean isWeekday, boolean isVacation) {
        boolean result;

        if (isWeekday == true && isVacation == true) {
            return true;
        } else if (isWeekday == true && isVacation == false) {
            return false;
        } else if (isWeekday == false) {
            return true;
        }else {return false;}
    }
}
