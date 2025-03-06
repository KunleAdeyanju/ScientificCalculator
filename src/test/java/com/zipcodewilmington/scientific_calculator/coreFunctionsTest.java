package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.coreFunctions;
import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

public class coreFunctionsTest {

    @Test
    public void testAdd1(){
        double actual = coreFunctions.addition(4,5);
        assertEquals(9,actual,0.001);
    }

    @Test
    public void testAdd2(){
        double actual = coreFunctions.addition(20000,410);
        assertEquals(20410,actual,0.001);
    }

    @Test
    public void testAdd3(){
        double actual = coreFunctions.addition(4.5,6.72);
        assertEquals(11.22,actual,0.001);
    }

    @Test
    public void testSubtraction1(){
        double actual = coreFunctions.subtract(10,4);
        assertEquals(6, actual, 0.001);
    }

    @Test
    public void testSubtraction2(){
        double actual = coreFunctions.subtract(89.7545,76.554);
        assertEquals(13.2005, actual, 0.001);
    }

    @Test
    public void testSubtraction3(){
        double actual = coreFunctions.subtract(345,269);
        assertEquals(76, actual, 0.001);
    }

    @Test
    public void testmultiplication1(){
        double actual = coreFunctions.multiplication(10,4);
        assertEquals(40, actual, 0.001);
    }

    @Test
    public void testmultiplication2(){
        double actual = coreFunctions.multiplication(42.678,9.872);
        assertEquals(421.3172, actual, 0.001);
    }

    @Test
    public void testmultiplication3(){
        double actual = coreFunctions.multiplication(4425,10000);
        assertEquals(44250000, actual, 0.001);
    }



    @Test
    public void testexp(){
        double actual = coreFunctions.exp(4,2);
        assertEquals(16, actual, 0.001);
    }


    @Test
    public void testsquare(){
        double actual = coreFunctions.square(4);
        assertEquals(16, actual, 0.001);
    }



    /*




     */

    @Test
    public void testdivision1(){
        double actual = coreFunctions.division(10,5);
        assertEquals(2, actual, 0.001);
    }

    @Test
    public void testdivision2(){
        double actual = coreFunctions.division(0.5,16);
        assertEquals(0.0313, actual, 0.001);
    }



    @Test
    public void testsquareroot(){
        double actual = coreFunctions.squareRoot(4);
        assertEquals(2, actual, 0.001);
    }

    @Test
    public void testinverse(){
        double actual = coreFunctions.inverse(4);
        assertEquals(0.25, actual, 0.001);
    }

    @Test
    public void testdividebyzero1(){
        boolean actual = coreFunctions.isDividedByZero(0.0003);
        assertFalse(actual);
    }

    @Test
    public void testdividebyzero2(){
        boolean actual = coreFunctions.isDividedByZero(0.000);
        assertTrue(actual);
    }

    @Test
    public void testdividebyzero3(){
        boolean actual = coreFunctions.isDividedByZero(0.00000000000000000000000000000000003);
        assertFalse(actual);
    }
}

