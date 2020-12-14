package com.javamultiplex.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 14/12/20 8:43 pm
 * @copyright www.javamultiplex.com
 */
public class NumberOfTrailingZerosInFactorialOfNumberTest {
    @Test
    public void shouldTestMethod1() {
        int result1 = NumberOfTrailingZerosInFactorialOfNumber.method1(5);
        assertEquals(1, result1);

        int result2 = NumberOfTrailingZerosInFactorialOfNumber.method1(20);
        assertEquals(4, result2);

        int result3 = NumberOfTrailingZerosInFactorialOfNumber.method1(30);
        assertEquals(7, result3);

        int result4 = NumberOfTrailingZerosInFactorialOfNumber.method1(90);
        assertEquals(21, result4);
    }
}
