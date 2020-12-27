package com.javamultiplex.mathematics.problems;

import com.javamultiplex.mathematics.problems.TemperatureConversion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 16/12/20 11:00 pm
 * @copyright www.javamultiplex.com
 */
public class TemperatureConversionTest {

    @Test
    public void shouldDoCelsiusToFahrenheitConversion() {
        double result1 = TemperatureConversion.cToF(32);
        assertEquals(89, result1);
        double result2 = TemperatureConversion.cToF(50);
        assertEquals(122, result2);
    }

    @Test
    public void shouldDoFahrenheitToCelsiusConversion() {
        double result1 = TemperatureConversion.fToC(89);
        assertEquals(31, result1);
        double result2 = TemperatureConversion.fToC(122);
        assertEquals(50, result2);
    }
}
