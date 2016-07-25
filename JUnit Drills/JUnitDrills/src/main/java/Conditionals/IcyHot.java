/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

/**
 *
 * @author apprentice
 */
public class IcyHot {

    public boolean IcyHot(int temp1, int temp2) {

        return temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0;
    }
}
