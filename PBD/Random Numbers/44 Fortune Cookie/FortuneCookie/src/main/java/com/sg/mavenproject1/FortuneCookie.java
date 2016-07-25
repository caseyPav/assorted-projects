/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.mavenproject1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author casey
 */
public class FortuneCookie {
            public static void main(String[] args) {
        
       
        Random r = new Random();
        
        int fortune = ( 1+ r.nextInt(6));
        
        
        
        if (fortune == 1)
            System.out.println("fortune one");
        else if(fortune == 2 )
                System.out.println("fortune two");
        else if (fortune == 3)
                    System.out.println("fortune three");
        else if (fortune == 4)
                    System.out.println("fortune four");
        else if (fortune == 5)
                    System.out.println("fortune five");
        else if (fortune == 6)
                    System.out.println("fortune six");
        
 
        
        
        
        
    }
}
