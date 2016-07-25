/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.statecapitals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class StateCapitals {

    public static void main(String[] args) {
        
        

        HashMap<String, String> stateCapital = new HashMap();

        stateCapital.put("Alabama", "Montgomery");
        stateCapital.put("Alaska", "Juneau");
        stateCapital.put("Arizona", "Phoenix");
        stateCapital.put("Arkansas", "Little Rock");
        stateCapital.put("California", "Sacramento");
        stateCapital.put("Alabama", "Montgomery");
        stateCapital.put("Colorado", "Denver");
        stateCapital.put("Connecticut", "Hartford");
        stateCapital.put("Deleware", "Dover");
        stateCapital.put("Flordia", "Tallahassee");
        stateCapital.put("Georgia", "Atlanta");
        stateCapital.put("Hawaii", "Honolulu");
        stateCapital.put("Idaho", "Bosie");
        stateCapital.put("Illinois", "Springfield");
        stateCapital.put("Indiana", "Indianapolis");
        stateCapital.put("Iowa", "Des Moines");
        stateCapital.put("Kansas", "Topeka");
        stateCapital.put("Kentucky", "Frankfort");
        stateCapital.put("Louisiana", "Baton Rouge");
        stateCapital.put("Maine", "Agugusta");
        stateCapital.put("Maryland", "Annapolis");
        stateCapital.put("Massachusetts", "Boston");
        stateCapital.put("Michigan", "Lansing");
        stateCapital.put("Minnesota", "St. Paul");
        stateCapital.put("Mississippi", "Jackson");
        stateCapital.put("Missouri", "Jefferson City");
        stateCapital.put("Montana", "Helena");
        stateCapital.put("Nebraska", "lincoln");
        stateCapital.put("Nevada", "Carson City");
        stateCapital.put("New Hampshire", "Concord");
        stateCapital.put("New Jersey", "Trenton");
        stateCapital.put("New Mexico", "Santa Fe");
        stateCapital.put("New York", "Albany");
        stateCapital.put("North Carolina", "Raleigh");
        stateCapital.put("North Dakota", "Bismarck");
        stateCapital.put("Ohio", "Columbus");
        stateCapital.put("Oklahoma", "Oklahoma City");
        stateCapital.put("Oregon", "Salem");
        stateCapital.put("Pennsylvania", "Harrisburg");
        stateCapital.put("Rhode Island", "Providence");
        stateCapital.put("South Carolina", "Columbia");
        stateCapital.put("South Dakota", "Pierre");
        stateCapital.put("Tennessee", "Nashville");
        stateCapital.put("Texas", "Austin");
        stateCapital.put("Utah", "Salt Lake City");
        stateCapital.put("Vermont", "Montpelier");
        stateCapital.put("Virginia", "Richmond");
        stateCapital.put("Washingtom", "Olympia");
        stateCapital.put("West Virginia", "Charleston");
        stateCapital.put("Wisconsin", "Madison");
        stateCapital.put("Wyoming", "Cheyenne");

        Set set = stateCapital.entrySet();
        Iterator iterator = set.iterator();
        System.out.println("STATES");
        System.out.println("===============\n");
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println(mentry.getKey());
        }

        System.out.println("\nCAPITALS");
        System.out.println("===============\n");
        iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println(mentry.getValue());
        }

        System.out.println("\nSTATE/CAPITAL PAIRS");
        System.out.println("===============\n");
        iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println(mentry.getKey() + " - " + mentry.getValue());
        }

    }
}
