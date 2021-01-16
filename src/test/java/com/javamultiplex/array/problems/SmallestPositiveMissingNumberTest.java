package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 10/01/21 8:15 pm
 * @copyright www.javamultiplex.com
 */
public class SmallestPositiveMissingNumberTest {
    @Test
    public void shouldFindMissingNumber_method1() {
        int result = SmallestPositiveMissingNumber.method1(new int[]{0, -10, 1, 3, -20}, 5);
        assertEquals(2, result);
        int result2 = SmallestPositiveMissingNumber.method1(new int[]{1, 2, 3, 4, 5}, 5);
        assertEquals(6, result2);
    }

    @Test
    public void shouldFindMissingNumber_method2() {
        int result = SmallestPositiveMissingNumber.method2(new int[]{0, -10, 1, 3, -20}, 5);
        assertEquals(2, result);
        int result2 = SmallestPositiveMissingNumber.method2(new int[]{1, 2, 3, 4, 5}, 5);
        assertEquals(6, result2);
    }

    @Test
    public void shouldFindMissingNumber_method3() {
        int result = SmallestPositiveMissingNumber.method3(new int[]{0, -10, 1, 3, -20}, 5);
        assertEquals(2, result);
        int result2 = SmallestPositiveMissingNumber.method3(new int[]{1, 2, 3, 4, 5}, 5);
        assertEquals(6, result2);
    }

    @Test
    public void shouldFindMissingNumber_method4() {
        int result = SmallestPositiveMissingNumber.method4(new int[]{0, -10, 1, 3, -20}, 5);
        assertEquals(2, result);
        int result2 = SmallestPositiveMissingNumber.method4(new int[]{1, 2, 3, 4, 5}, 5);
        assertEquals(6, result2);
    }
}
