package com.generation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest { //desde aqui se corren todas las pruebas

    Calculator calculator = new Calculator();

    @Test
    public void addTest()
    {
        assertEquals( 8, calculator.addNumbers( 5, 3 ) );
    }


    @Test
    public void subtractTest()
    {
        assertEquals( 5, calculator.subtractNumbers( 10, 5 ) );
    }


    @Test
    public void multiplyTest()
    {
        assertEquals( 15, calculator.multiplyNumbers( 5, 3 ) );
    }


    @Test
    public void divideTest()
    {
        assertEquals( 0, calculator.divideNumbers( 5, 0 ) );
    }

}
