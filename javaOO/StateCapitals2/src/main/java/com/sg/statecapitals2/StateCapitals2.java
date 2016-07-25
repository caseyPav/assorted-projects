package com.sg.statecapitals2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StateCapitals2 {

    public static void main(String[] args) {
        ConsoleIO console = new ConsoleIO();
        HashMap<String, Capitals> stateCapital = new HashMap<String, Capitals>();

        stateCapital.put("Alabama", new Capitals("Montgomery", 230000, 67));
        stateCapital.put("Alaska", new Capitals("jueno", 100000, 98));
        stateCapital.put("Arizona", new Capitals("Phoenix", 450000, 134));
        stateCapital.put("Arkansas", new Capitals("Little Rock", 250000, 145));
        stateCapital.put("California", new Capitals("Sacramento", 1000000, 323));
        stateCapital.put("Colorado", new Capitals("Devnver", 750000, 222));
        stateCapital.put("Connecticut", new Capitals("Hartford", 200000, 23));
        stateCapital.put("Deleware", new Capitals("Dover", 120000, 45));
        stateCapital.put("Flordia", new Capitals("Tallahassee", 250000, 223));
        stateCapital.put("Georgia", new Capitals("Atlanta", 500000, 123));
        stateCapital.put("Hawaii", new Capitals("Honalulu", 75000, 13));
        stateCapital.put("Idaho", new Capitals("Bosie", 100000, 78));
        stateCapital.put("Illinois", new Capitals("Springfield", 300000, 56));
        stateCapital.put("Indiana", new Capitals("Indianapollis", 400000, 423));
        stateCapital.put("Iowa", new Capitals("I forget", 46000, 12));

        System.out.println("\nSTATE INFORMATION");
        System.out.println("===============\n");

        Set set = stateCapital.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print(mentry.getKey() + " Capital: ");
            System.out.print(((Capitals) mentry.getValue()).getName() + ", Population: ");
            System.out.print(((Capitals) mentry.getValue()).getPop() + ", Size: ");
            System.out.print(((Capitals) mentry.getValue()).getSize() + " Sq Miles\n");}
            
        int userSelect = console.promptForInt("\nPLEASE CHOOSE A MINUMUM POP: ");

            iterator = set.iterator();
            while (iterator.hasNext()) {
                Map.Entry mentry = (Map.Entry) iterator.next();
                if (userSelect < ((Capitals) mentry.getValue()).getPop()) {
                    System.out.print(mentry.getKey() + " Capital: ");
                    System.out.print(((Capitals) mentry.getValue()).getName() + ", Population: ");
                    System.out.print(((Capitals) mentry.getValue()).getPop() + ", Size: ");
                    System.out.print(((Capitals) mentry.getValue()).getSize() + " Sq Miles\n");
                }
            }
        }
    }

