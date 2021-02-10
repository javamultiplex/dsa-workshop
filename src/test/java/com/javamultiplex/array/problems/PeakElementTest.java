package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 10/02/21 11:17 pm
 * @copyright www.javamultiplex.com
 */
public class PeakElementTest {

    @Test
    public void shouldFindPeakElement_method1() {
        int index = PeakElement.method1(new int[]{1, 2, 3, 4, 5});
        assertEquals(4, index);
        int index2 = PeakElement.method1(new int[]{5, 4, 3, 2, 1});
        assertEquals(0, index2);
        int index3 = PeakElement.method1(new int[]{1, 1, 1, 1, 1});
        assertEquals(0, index3);
        int index4 = PeakElement.method1(new int[]{10, 20, 15, 2, 23, 90, 67});
        assertEquals(1, index4);
    }

    @Test
    public void shouldFindPeakElement_method2() {
        int index = PeakElement.method2(new int[]{1, 2, 3, 4, 5});
        assertEquals(4, index);
        int index2 = PeakElement.method2(new int[]{5, 4, 3, 2, 1});
        assertEquals(0, index2);
        int index3 = PeakElement.method2(new int[]{1, 1, 1, 1, 1});
        assertEquals(2, index3);
        int index4 = PeakElement.method2(new int[]{10, 20, 15, 2, 23, 90, 67});
        assertEquals(1, index4);
    }
}
