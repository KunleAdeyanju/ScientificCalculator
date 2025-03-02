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
}
