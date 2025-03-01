package com.zipcodewilmington.scientificcalculator;

public class coreFunctions {

    // arguments class CoreFunctions takes
    double x,y;
    coreFunctions(double a, double b){
        x = a;
        y = b;
    }

    // method to add
    public static double addition( double x, double y){
        return x + y;
    }





    // method to square numbers
    public static double square(double x){
        return x*x;
    }

    // square root
    public static double squareRoot(double x){
        return Math.sqrt(x);
    }

}
