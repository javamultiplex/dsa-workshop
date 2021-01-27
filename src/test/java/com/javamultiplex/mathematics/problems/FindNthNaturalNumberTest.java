package com.javamultiplex.mathematics.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 27/01/21 10:27 pm
 * @copyright www.javamultiplex.com
 */
public class FindNthNaturalNumberTest {

    @Test
    public void shouldFindNthNaturalNumber_method1() {
        long result = FindNthNaturalNumber.method1(8);
        assertEquals(8, result);
        long result1 = FindNthNaturalNumber.method1(9);
        assertEquals(10, result1);
        long result2 = FindNthNaturalNumber.method1(15);
        assertEquals(16, result2);
        long result3 = FindNthNaturalNumber.method1(20);
        assertEquals(22, result3);
    }

    @Test
    public void shouldFindNthNaturalNumber_method2() {
        long result = FindNthNaturalNumber.method2(8);
        assertEquals(8, result);
        long result1 = FindNthNaturalNumber.method2(9);
        assertEquals(10, result1);
        long result2 = FindNthNaturalNumber.method2(15);
        assertEquals(16, result2);
        long result3 = FindNthNaturalNumber.method2(20);
        assertEquals(22, result3);
    }

    @Test
    public void shouldFindNthNaturalNumber_method3() {
        long result = FindNthNaturalNumber.method3(8);
        assertEquals(8, result);
        long result1 = FindNthNaturalNumber.method3(9);
        assertEquals(10, result1);
        long result2 = FindNthNaturalNumber.method3(15);
        assertEquals(16, result2);
        long result3 = FindNthNaturalNumber.method3(20);
        assertEquals(22, result3);
    }

    @Test
    public void shouldFindNthNaturalNumber_method4() {
        long result = FindNthNaturalNumber.method4(8);
        assertEquals(8, result);
        long result1 = FindNthNaturalNumber.method4(9);
        assertEquals(10, result1);
        long result2 = FindNthNaturalNumber.method4(15);
        assertEquals(16, result2);
        long result3 = FindNthNaturalNumber.method4(20);
        assertEquals(22, result3);
    }
}
