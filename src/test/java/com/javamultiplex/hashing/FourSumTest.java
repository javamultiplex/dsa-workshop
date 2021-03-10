package com.javamultiplex.hashing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

/**
 * @author Rohit Agarwal on 08/03/21 11:09 pm
 * @copyright www.javamultiplex.com
 */
public class FourSumTest {

    @Test
    public void shouldGetFourSum_method1() {
        assertIterableEquals(Collections.singletonList(Arrays.asList(0, 0, 1, 2)),
                FourSum.method1(new int[]{0, 0, 2, 1, 1}, 3));

        assertIterableEquals(Arrays.asList(Arrays.asList(2, 3, 8, 10), Arrays.asList(2, 4, 7, 10), Arrays.asList(3, 5, 7, 8)),
                FourSum.method1(new int[]{10, 2, 3, 4, 5, 7, 8}, 23));
    }

    @Test
    public void shouldGetFourSum_method2() {
        assertIterableEquals(Collections.singletonList(Arrays.asList(0, 0, 1, 2)),
                FourSum.method2(new int[]{0, 0, 2, 1, 1}, 3));

        assertIterableEquals(Arrays.asList(Arrays.asList(2, 3, 8, 10), Arrays.asList(2, 4, 7, 10), Arrays.asList(3, 5, 7, 8)),
                FourSum.method2(new int[]{10, 2, 3, 4, 5, 7, 8}, 23));
    }
}
