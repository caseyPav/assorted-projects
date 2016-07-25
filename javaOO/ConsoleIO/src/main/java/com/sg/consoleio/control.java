package com.sg.consoleio;

public class control {

    public static void main(String[] args) {

        ConsoleIO console = new ConsoleIO();
        System.out.println("        SIMPLE CALCULATOR");
        System.out.println("        ==================");

        boolean replay = true;
        do {
            System.out.println("\n PLEASE SELECT:");
            System.out.println("    1: ADD TWO NUMBERS");
            System.out.println("    2. SUBTRACT TWO NUMBERS");
            System.out.println("    3. MULTIPLY TWO NUMBERS");
            System.out.println("    4. DIVIDE TWO NUMBERS");
            System.out.println("    5. EXIT");

            int userSelect = console.promptForIntWithRange("PLEASE CHOOSE:  ", 1, 5);

            switch (userSelect) {
                case 1:
                    int num1 = console.promptForInt("please enter first number to add:");
                    int num2 = console.promptForInt("please enter second number to add:");
                    System.out.println("the result is:  " + Logic.add(num1, num2));
                    break;
                case 2:
                    int num3 = console.promptForInt("please enter first number to subtract:");
                    int num4 = console.promptForInt("please enter second number to subtract:");
                    System.out.println("the result is:  " + Logic.subtract(num3, num4));
                    break;
                case 3:
                    int num5 = console.promptForInt("please enter first number to multiply:");
                    int num6 = console.promptForInt("please enter second number to multiply:");
                    System.out.println("the result is:  " + Logic.multiply(num5, num6));
                    break;
                case 4:
                    int num7 = console.promptForInt("please enter first number to add:");
                    int num8 = console.promptForInt("please enter second number to add:");
                    System.out.println("the result is:  " + Logic.divide(num7, num8));
                    break;
                case 5:
                    System.out.println("THANK YOU FOR USING THIS MOST EXCELLENT CALCULATOR");
                    replay = false;
                    break;
            }
        } while (replay == true);

    }

}
