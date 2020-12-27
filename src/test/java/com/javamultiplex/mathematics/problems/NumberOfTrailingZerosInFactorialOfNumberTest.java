package com.javamultiplex.mathematics.problems;

import com.javamultiplex.mathematics.problems.NumberOfTrailingZerosInFactorialOfNumber;
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

        int result5 = NumberOfTrailingZerosInFactorialOfNumber.method2(125);
        assertEquals(31, result5);
    }

    @Test
    public void shouldTestMethod2() {
        int result1 = NumberOfTrailingZerosInFactorialOfNumber.method2(5);
        assertEquals(1, result1);

        int result2 = NumberOfTrailingZerosInFactorialOfNumber.method2(20);
        assertEquals(4, result2);

        int result3 = NumberOfTrailingZerosInFactorialOfNumber.method2(30);
        assertEquals(7, result3);

        int result4 = NumberOfTrailingZerosInFactorialOfNumber.method2(90);
        assertEquals(21, result4);

        int result5 = NumberOfTrailingZerosInFactorialOfNumber.method2(125);
        assertEquals(31, result5);
    }
}
