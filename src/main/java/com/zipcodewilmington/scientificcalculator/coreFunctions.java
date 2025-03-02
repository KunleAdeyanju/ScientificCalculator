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

    // method to exponentiation x, y ..x^y
    public static double exp(double x, double y) {
        return Math.pow(x,y);
    }

    // method to inverse
    public static double inverse(double x) {

        return 1/x;
    }

    // method to square numbers
    public static double square(double x) {

        return x*x;
    }

    // method to Invert the sign
    public static double invert(int x) {
        return -1*x;
    }

    // square root
    public static double squareRoot(double x){
            return Math.sqrt(x);
    }




}
