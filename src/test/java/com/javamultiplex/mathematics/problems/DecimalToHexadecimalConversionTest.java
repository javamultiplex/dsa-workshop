package com.javamultiplex.mathematics.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 17/02/21 11:20 pm
 * @copyright www.javamultiplex.com
 */
public class DecimalToHexadecimalConversionTest {

    @Test
    public void shouldConvertDecimalToHexadecimal() {
        assertEquals("1b", DecimalToHexadecimalConversion.doConversion(27));
        assertEquals("20", DecimalToHexadecimalConversion.doConversion(32));
        assertEquals("a", DecimalToHexadecimalConversion.doConversion(10));
        assertEquals("f", DecimalToHexadecimalConversion.doConversion(15));
        assertEquals("1", DecimalToHexadecimalConversion.doConversion(1));
    }
}
