/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.keychains2;

import java.util.Scanner;

/**
 *
 * @author casey
 */
public class keychains2 {
    
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("keychain shop");
        System.out.println("1. add keychains");
        System.out.println("2. remove keychaisn from order");
        System.out.println("3. view current order");
        System.out.println("4. checkout");
        int choice = sc.nextInt();
        
        int price = 10;
        int number = 0; 
        
        
        switch (choice) {
            case 1:
                add_keychains();
                break;
            case 2:
                remove_keychains();
                break;
            case 3:
                view_order();
                break;
            case 4:
                checkout();
                break;
            default:
                break;
        }
        
                
    }
    
    public static void add_keychains(){
    
        System.out.println("add keychains");
        
    }
    
    public static void remove_keychains(){
    
        System.out.println("remove keychains");
    }
    
    public static void view_order(){
    
        System.out.println("view order");
    }
    
    public static void checkout(){
    
        System.out.println("checkout");
    }
    
}
