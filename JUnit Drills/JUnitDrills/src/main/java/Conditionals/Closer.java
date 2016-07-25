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
public class Closer {

    public int Closer(int a, int b) {
        int a1 = 0;
        int b1 = 0;
if(a!=0&&b!=0){
} else {
    if (a < 10) {
        a1 = (10 - a);
    } else if (a > 10) {
        a1 = (a - 10);
    } else if (b < 10) {
        b1 = (10 - b);
    } else if (b > 10) {
        b1 = (a - 10);
        
    }if (a1 < b1) {
        return b;
    } else if (a1 > b1) {
        return a;
    }
        }

        return 0;
    }}

