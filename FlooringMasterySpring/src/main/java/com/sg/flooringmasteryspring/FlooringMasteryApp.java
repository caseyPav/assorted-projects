
package com.sg.flooringmasteryspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author CASEY
 */
public class FlooringMasteryApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        FlooringMasteryController fmc = (FlooringMasteryController) ctx.getBean("JohnnyFive");      
        fmc.setup();
    }

}
