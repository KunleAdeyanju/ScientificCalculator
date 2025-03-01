package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        // trigger to keep program running until runTime!=1
        // terminate program
        int runTime = 1;

        // variable used to track the state of the program
        double previousCalculationDouble = 0;
        int storeAnswer = 0;
        double oldAnswer = 0;
        boolean isAnswerStored = false;

        Console.println("Welcome to my calculator!");
        // keep the program operating until user signs they are done
        do {
            String s = Console.getStringInput("What would you like to do");


            // cycles through the calculation available to the user
            switch (s.toLowerCase()){
                case "quit":
                    runTime = 0;
                    break;
                case "add":
                    // runs correct script dependent on if there is a previous answer stored
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
                    isAnswerStored = true;
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
                    isAnswerStored = true;
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
                    isAnswerStored = true;
                    break;
                // in case of typo return to beginning of the loop
                default:
                    Console.println("That wasn't an option");
                    if(storeAnswer == 1){
                        Console.println(" Your stored answer is " + Console.resultsFormat(oldAnswer));

                    }
            }

            // only offer option to store answer if there is an answer to store
            // in every case variable are reset
            if ( isAnswerStored) {
                String a = Console.getStringInput("Do you wish to use wish to store the answer ? (Y/N)");
                if (a.equalsIgnoreCase("y")) {
                    storeAnswer = 1;
                    oldAnswer = previousCalculationDouble;
                    previousCalculationDouble = 0;
                    Console.println(" Your stored answer is " + Console.resultsFormat(oldAnswer));
                    isAnswerStored = false;
                } else if (a.equalsIgnoreCase("n")) {
                    storeAnswer = 0;
                    previousCalculationDouble = 0;
                    isAnswerStored = false;
                } else if (a.equalsIgnoreCase("quit")){
                    runTime = 0;
                }else {
                    Console.println("That wasn't an option, sorry data is lost please start again");
                    previousCalculationDouble = 0;
                    storeAnswer = 0;
                    isAnswerStored = false;


                }
            }

        }while (runTime == 1);
    }
}
