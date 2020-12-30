package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 29/12/20 11:50 pm
 * @copyright www.javamultiplex.com
 */
public class MaximumSumOfKConsecutiveElementsTest {

    @Test
    public void shouldTestMethod1() {
        int result1 = MaximumSumOfKConsecutiveElements.method1(new int[]{100, 200, 300, 400}, 4, 2);
        assertEquals(700, result1);

        int result2 = MaximumSumOfKConsecutiveElements.method1(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20}, 9, 4);
        assertEquals(39, result2);

        int result3 = MaximumSumOfKConsecutiveElements.method1(new int[]{2, 3}, 2, 3);
        assertEquals(-1, result3);
    }

    @Test
    public void shouldTestMethod2() {
        int result1 = MaximumSumOfKConsecutiveElements.method2(new int[]{100, 200, 300, 400}, 4, 2);
        assertEquals(700, result1);

        int result2 = MaximumSumOfKConsecutiveElements.method2(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20}, 9, 4);
        assertEquals(39, result2);

        int result3 = MaximumSumOfKConsecutiveElements.method2(new int[]{2, 3}, 2, 3);
        assertEquals(-1, result3);
    }
}
