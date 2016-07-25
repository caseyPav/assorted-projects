/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author apprentice
 */
public class InsertWord {

    public String InsertWord(String word, String container) {
        String a = container.substring(0, 2);
        String b = container.substring(2, 4);
        return (a + word + b);

    }
}
