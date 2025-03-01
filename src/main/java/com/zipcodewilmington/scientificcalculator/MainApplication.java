package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        // trigger to keep program running until runTime!=1
        // terminate program
        int runTime = 1;

        double previousCalculationDouble;
        //int previousCalculationInt;

        do {

            Console.println("Welcome to my calculator!");
            String s = Console.getStringInput("What would you like to do");
            if(s.equalsIgnoreCase("quit")){
                runTime = 0;
            }else if (s.equalsIgnoreCase("add")){
                double x = Console.getDoubleInput("Enter number 1: ");
                double y = Console.getDoubleInput("Enter number 2: ");
                previousCalculationDouble = coreFunctions.addition(x,y);
                Console.println(y + " + " + x + " = " + previousCalculationDouble);
            } else if (s.equalsIgnoreCase("square")) {
                double x = Console.getDoubleInput("Enter number 1: ");
                previousCalculationDouble = coreFunctions.square(x);
                Console.println(x + " squared is " +previousCalculationDouble);
            }

            /*

            String a = Console.getStringInput("Do you wish to use wish to use answer");
            if(a.equalsIgnoreCase("yes")){
                double newX = previousCalculationDouble;
                String s = Console.getStringInput("What would you like to do");
                if(s.equalsIgnoreCase("quit")){
                    runTime = 0;
                }else if (s.equalsIgnoreCase("add")){
                    double y = Console.getDoubleInput("Enter number 2: ");
                    previousCalculationDouble = coreFunctions.addition(newX,y);
                    Console.println(y + " + " + newX + " = " + previousCalculationDouble);
                } else if (s.equalsIgnoreCase("square")) {
                    double x = Console.getDoubleInput("Enter number 1: ");
                    previousCalculationDouble = coreFunctions.square(newX);
                    Console.println(x + " squared is " +previousCalculationDouble);
                }
            }
            */

            /*Integer i = Console.getIntegerInput("Enter an integer");
            Double d = Console.getDoubleInput("Enter a double.");

            Console.println("The user input %s as a string", s);
            Console.println("The user input %s as a integer", i);
            Console.println("The user input %s as a d", d);

             */
        }while (runTime == 1);
    }
}
