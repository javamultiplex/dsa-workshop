package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 26/01/21 10:45 pm
 * @copyright www.javamultiplex.com
 */
public class SquareRootTest {

    @Test
    public void shouldFindSqrt_method1() {
        long result = SquareRoot.method1(11);
        assertEquals(3, result);
        long result1 = SquareRoot.method1(16);
        assertEquals(4, result1);
        long result2 = SquareRoot.method1(8);
        assertEquals(2, result2);
        long result3 = SquareRoot.method1(2);
        assertEquals(1, result3);
    }

    @Test
    public void shouldFindSqrt_method2() {
        long result = SquareRoot.method2(11);
        assertEquals(3, result);
        long result1 = SquareRoot.method2(16);
        assertEquals(4, result1);
        long result2 = SquareRoot.method2(8);
        assertEquals(2, result2);
        long result3 = SquareRoot.method2(2);
        assertEquals(1, result3);
    }
}
