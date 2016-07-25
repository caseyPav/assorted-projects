/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditionals;

import org.apache.commons.lang.StringUtils;

/**
 *
 * @author apprentice
 */
public class EEEEE {

    public boolean EEEEE(String str) {
        int count = StringUtils.countMatches(str, "e");
        if (count >= 1 && count <= 3) {
            return true;
        } else {
            return false;
        }
    }
}
