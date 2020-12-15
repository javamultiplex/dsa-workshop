package com.javamultiplex.mathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 15/12/20 9:29 pm
 * @copyright www.javamultiplex.com
 */
public class SmallestDivisibleNumberTest {
    @Test
    public void shouldTestMethod1() {
        long result1 = SmallestDivisibleNumber.method1(2);
        assertEquals(2, result1);
        long result2 = SmallestDivisibleNumber.method1(3);
        assertEquals(6, result2);
        long result3 = SmallestDivisibleNumber.method1(6);
        assertEquals(60, result3);
        long result4 = SmallestDivisibleNumber.method1(7);
        assertEquals(420, result4);
        long result5 = SmallestDivisibleNumber.method1(19);
        assertEquals(232792560, result5);
        long result6 = SmallestDivisibleNumber.method1(25);
        assertEquals(26771144400L, result6);
    }
}
