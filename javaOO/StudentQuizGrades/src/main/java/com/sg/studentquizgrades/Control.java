package com.sg.studentquizgrades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Control {

    public static void main(String[] args) throws InterruptedException {

        ConsoleIO console = new ConsoleIO();
        HashMap<String, ArrayList<Integer>> studentList = new HashMap<String, ArrayList<Integer>>();

        studentList.put("john", new ArrayList<Integer>(Arrays.asList(90, 80, 100, 70, 65)));
        studentList.put("mary", new ArrayList<Integer>(Arrays.asList(93, 72, 86, 50, 100)));
        studentList.put("suzie", new ArrayList<Integer>(Arrays.asList(70, 87, 92, 98, 90)));
        studentList.put("ralph", new ArrayList<Integer>(Arrays.asList(45, 98, 86, 86, 86)));
        studentList.put("george", new ArrayList<Integer>(Arrays.asList(67, 89, 90, 98, 72)));
        studentList.put("gene", new ArrayList<Integer>(Arrays.asList(100, 78, 98, 88, 79)));
        studentList.put("ronda", new ArrayList<Integer>(Arrays.asList(45, 70, 78, 78, 67)));
        studentList.put("eugenia", new ArrayList<Integer>(Arrays.asList(100, 100, 100, 100, 100)));
        studentList.put("deloris", new ArrayList<Integer>(Arrays.asList(78, 88, 97, 67, 90)));
        studentList.put("pete", new ArrayList<Integer>(Arrays.asList(78, 88, 65, 34, 100)));

        System.out.println("        STUDENT GRADE DATABASE");
        System.out.println("        ======================");

        int userSelect = 0;

        do {
            System.out.println("\n PLEASE SELECT:");
            System.out.println("    1: VIEW LIST OF STUDENTS");
            System.out.println("    2. ADD STUDENT");
            System.out.println("    3. REMOVE STUDENT");
            System.out.println("    4. VIEW STUDENT QUIZ RECORDS");
            System.out.println("    5. VIEW STUDENT'S CURRENT AVERAGE");
            System.out.println("    6. EXIT DATABASE");

            userSelect = console.promptForIntWithRange("PLEASE CHOOSE: ", 1, 6);

            switch (userSelect) {
                case 1: {
                    Set set = studentList.entrySet();
                    Iterator iterator = set.iterator();
                    System.out.println("STUDENT NAMES");
                    System.out.println("===============\n");
                    while (iterator.hasNext()) {
                        Map.Entry mentry = (Map.Entry) iterator.next();
                        System.out.println(mentry.getKey());
                    }
                    break;
                }
                case 2:
                    studentList.put(addname(), new ArrayList<Integer>(Arrays.asList(78, 88, 65, 34, 100)));
                    break;
                case 3:
                    studentList.remove(removeName());
                    break;
                case 4: {
                    Set set = studentList.entrySet();
                    Iterator iterator = set.iterator();
                    while (iterator.hasNext()) {
                        Map.Entry mentry = (Map.Entry) iterator.next();
                        if (studentList.containsKey(keys())) {
                            System.out.println(mentry.getValue());
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    Set set = studentList.entrySet();
                    Iterator iterator = set.iterator();
                    while (iterator.hasNext()) {
                        Map.Entry mentry = (Map.Entry) iterator.next();
                        if (studentList.containsKey(keys())) {
                            ArrayList<Integer> scores = (ArrayList<Integer>) mentry.getValue();
                            int[] workingArray = new int[scores.size()];
                            int count = 0;
                            for (Integer n : scores) {
                                workingArray[count++] = n.intValue();
                            }
                            int sum = 0;
                            for (int i = 0; i < workingArray.length; i++) {
                                sum = sum + workingArray[i];
                            }
                            double average = sum / workingArray.length;
                            System.out.println("STUDENT AVERAGE: " + average);
                            break;
                        }
                    }
                    break;
                }
                case 6:
                    System.out.println("THANK YOU FOR USING THIS CRUMMY DATABASE");
                    break;
                default:
                    break;
            }

        } while (userSelect != 6);
    }

    private static String addname() {
        ConsoleIO console = new ConsoleIO();
        String newName;
        newName = console.promptForString("NAME TO ADD: ");
        return newName;

    }

    private static String removeName() {
        ConsoleIO console = new ConsoleIO();
        String removeName = console.promptForString("NAME TO REMOVE: ");
        return removeName;
    }

    private static String keys() {
        ConsoleIO console = new ConsoleIO();
        String name = console.promptForString("NAME OF STUDENT: ");
        return name;
    }
}
