package com.zipcodewilmington.scientificcalculator;

public class ScientificFeatures {
    // arguments class CoreFunctions takes
    double x, y;

    ScientificFeatures(double a, double b) {
        x = a;
        y = b;
    }

    // method to sine
    public static double sine( double x){
        return Math.sin(x);
    }

    // method to InverseSine
    public static double inversesSine( double x){
        return Math.asin(x);
    }


    // method to cosine
    public static double cosine( double x){
        return Math.cos(x);
    }

    // method to InverseCosine
    public static double inverseCosine( double x){
        return Math.acos(x);
    }

    // method to Tangent
    public static double tangent( double x){
        return Math.tan(x);
    }

    // method to Tangent
    public static double inverseTangent( double x){
        return Math.atan(x);
    }
}





