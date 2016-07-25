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
public class CountLast2 {

    public int CountLast2(String str) {
        char a = str.charAt(str.length()-2);
        char b = str.charAt(str.length()-1);
        String check = Character.toString(a)+Character.toString(b);
        Pattern p = Pattern.compile(check);
        Matcher m = p.matcher(str);
        int count = 0;
        while (m.find()) {
            count += 1;
        }
        return count-1;

    }

}
