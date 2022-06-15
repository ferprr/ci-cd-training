package com.aulapratica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest
{

    @Test
    public void testSum() {

        //given
        float value1 = 2;
        float value2 = 3;
        float expectSum = 5;

        //when
        float returnedValue = Calculadora.sum(value1, value2);

        //then
        assertEquals(expectSum, returnedValue, 0);
    }

    @Test
    public void testSubtract() {

        //given
        float value1 = 2;
        float value2 = 3;
        float expectSum = -1;

        //when
        float returnedValue = Calculadora.subtract(value1, value2);

        //then
        assertEquals(expectSum, returnedValue, 0);
    }

    @Test
    public void testDivide() {

        //given
        float value1 = 1;
        float value2 = 2;
        float expectSum = (float) 0.5;

        //when
        float returnedValue = Calculadora.divide(value1, value2);

        //then
        assertEquals(expectSum, returnedValue, 0);
    }

    @Test
    public void testMultiplicate() {

        //given
        float value1 = 2;
        float value2 = 3;
        float expectSum = 6;

        //when
        float returnedValue = Calculadora.multiplicate(value1, value2);

        //then
        assertEquals(expectSum, returnedValue, 0);
    }
}
