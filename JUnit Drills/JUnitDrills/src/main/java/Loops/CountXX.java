/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author apprentice
 */
public class CountXX {

    public int CountXX(String str) {
          Pattern p = Pattern.compile("xx");
    Matcher m = p.matcher(str);
    int count = 0;
    while (m.find()){
    	count +=1;
    }
        return count;
    }

}
