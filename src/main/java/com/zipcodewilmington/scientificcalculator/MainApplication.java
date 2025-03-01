package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        // trigger to keep program running until runTime!=1
        // terminate program
        int runTime = 1;

        double previousCalculationDouble = 0;
        int storeAnswer = 0;
        double oldAnswer = 0;
        //int previousCalculationInt;

        Console.println("Welcome to my calculator!");
        do {
            String s = Console.getStringInput("What would you like to do");


            switch (s.toLowerCase()){
                case "quit":
                    runTime = 0;
                    break;
                case "add":
                    if (storeAnswer == 0) {
                        double xAdd = Console.getDoubleInput("Enter number 1: ");
                        double yAdd = Console.getDoubleInput("Enter number 2: ");
                        previousCalculationDouble = coreFunctions.addition(xAdd, yAdd);
                        Console.println(xAdd + " + " + yAdd + " = " + Console.resultsFormat(previousCalculationDouble));
                    } else if (storeAnswer == 1) {
                        double x2 = oldAnswer;
                        double yAdd2 = Console.getDoubleInput("Enter number 2: ");
                        previousCalculationDouble = coreFunctions.addition(x2, yAdd2);
                        Console.println(x2+ " + " + yAdd2 + " = " + Console.resultsFormat(previousCalculationDouble));
                    }
                    break;
                case "square":
                    if (storeAnswer == 0) {
                        double xSquare = Console.getDoubleInput("Enter number 1: ");
                        previousCalculationDouble = coreFunctions.square(xSquare);
                        Console.println(xSquare + " squared is " + Console.resultsFormat(previousCalculationDouble));
                    } else if (storeAnswer == 1){
                        double xSquare2 = oldAnswer;
                        previousCalculationDouble = coreFunctions.square(xSquare2);
                        Console.println(xSquare2 + " squared is " + Console.resultsFormat(previousCalculationDouble));
                    }
                    break;
                case "square root":
                    if (storeAnswer == 0) {
                        double xsr = Console.getDoubleInput("Enter number 1: ");
                        previousCalculationDouble = coreFunctions.squareRoot(xsr);
                        Console.println("The square root of " + xsr + " is " + Console.resultsFormat(previousCalculationDouble));
                    } else if (storeAnswer == 1) {
                        double xsr2 = oldAnswer;
                        previousCalculationDouble = coreFunctions.squareRoot(xsr2);
                        Console.println("The square root of " + xsr2 + " is " + Console.resultsFormat(previousCalculationDouble));
                    }
                    break;
                default:
                    Console.println("That wasn't an option");
                    if(storeAnswer == 1){
                        Console.println(" Your stored answer is " + Console.resultsFormat(oldAnswer));

                    }
            }

            if ( previousCalculationDouble > 0) {
                String a = Console.getStringInput("Do you wish to use wish to store the answer ? (Y/N)");
                if (a.equalsIgnoreCase("y")) {
                    storeAnswer = 1;
                    oldAnswer = previousCalculationDouble;
                    previousCalculationDouble = 0;
                    Console.println(" Your stored answer is " + Console.resultsFormat(oldAnswer));
                } else if (a.equalsIgnoreCase("n")) {
                    storeAnswer = 0;
                    previousCalculationDouble = 0;
                } else if (a.equalsIgnoreCase("quit")){
                    runTime = 0;
                }else {
                    Console.println("That wasn't an option, sorry data is lost please start again");
                    previousCalculationDouble = 0;
                    storeAnswer = 0;


                }
            }


            /*
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
