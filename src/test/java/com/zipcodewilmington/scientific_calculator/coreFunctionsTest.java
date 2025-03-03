package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.coreFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class coreFunctionsTest {

    @Test
    public void testAdd(){
        double actual = coreFunctions.addition(4,5);
        assertEquals(9,actual,0.001);
    }

    @Test
    public void testSubtraction(){
        double actual = coreFunctions.subtract(10,4);
        assertEquals(6, actual, 0.001);
    }

    @Test
    public void testmultiplication(){
        double actual = coreFunctions.multiplication(10,4);
        assertEquals(40, actual, 0.001);
    }

    public void testdivision(){
        double actual = coreFunctions.division(10,5);
        assertEquals(2, actual, 0.001);
    }

    public void testexp(){
        double actual = coreFunctions.exp(4,2);
        assertEquals(16, actual, 0.001);
    }

    public void testinverse(){
        double actual = coreFunctions.inverse(4);
        assertEquals(1/4, actual, 0.001);
    }

    public void testsquare(){
        double actual = coreFunctions.square(4);
        assertEquals(16, actual, 0.001);
    }

    public void testsquareroot(){
        double actual = coreFunctions.squareRoot(4);
        assertEquals(2, actual, 0.001);
    }
}

