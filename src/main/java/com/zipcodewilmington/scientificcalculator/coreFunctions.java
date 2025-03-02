package com.zipcodewilmington.scientificcalculator;

public class coreFunctions {

    // arguments class CoreFunctions takes
    double x,y;
    coreFunctions(double a, double b) {
        x = a;
        y = b;
    }

    // method to add
    public static double addition( double x, double y) {

        return x + y;
    }

    // method to subtract
    public static double subtract( double x, double y) {

        return x - y;
    }

    // method to multiplication
    public static double multiplication( double x, double y) {

        return x * y;
    }

    // method to division
    public static double division( double x, double y) {

        return x/y;
    }

    // method to exponentiation
    public static double exp(double v, double v1) {
        return exp(0.0, 0.0);
    }

    private static <__TMP__> __TMP__ exp() {

        return null;
    }

    // method to inverse
    public static double inverse(double x) {

        return (x);
    }

    // method to square numbers
    public static double square(double x) {

        return x*x;
    }

    // method to Invert the sign
    public static void print(int i) {
        System.out.printf("\nReversed %s to %s .", i, -i);

    // square root
    public static double squareRoot(double x)
        {
            return Math.sqrt(x);
    }



}
