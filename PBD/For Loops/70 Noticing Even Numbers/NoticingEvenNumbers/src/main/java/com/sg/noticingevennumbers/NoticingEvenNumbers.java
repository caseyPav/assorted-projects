/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.noticingevennumbers;

/**
 *
 * @author casey
 */
public class NoticingEvenNumbers {
    
    public static void main(String[] args) {
        
        for ( int n = 1; n <= 20; n = n+1){
            
            if ( n % 2 == 0){
                System.out.println(n + "<");
            }else{
                System.out.println(n);
            }
        }
    }
    
}
