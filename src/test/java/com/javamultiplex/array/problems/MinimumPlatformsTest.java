package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 14/02/21 11:11 am
 * @copyright www.javamultiplex.com
 */
public class MinimumPlatformsTest {

    @Test
    public void shouldFindMinimumPlatforms_method1() {
        int platforms = MinimumPlatforms.method1(
                new int[]{900, 940, 950, 1100, 1500, 1800},
                new int[]{910, 1200, 1120, 1130, 1900, 2000},
                6);
        assertEquals(3, platforms);
        int platforms1 = MinimumPlatforms.method1(
                new int[]{900, 1100, 1235},
                new int[]{1000, 1200, 1240},
                3);
        assertEquals(1, platforms1);
    }

    @Test
    public void shouldFindMinimumPlatforms_method2() {
        int platforms = MinimumPlatforms.method1(
                new int[]{900, 940, 950, 1100, 1500, 1800},
                new int[]{910, 1200, 1120, 1130, 1900, 2000},
                6);
        assertEquals(3, platforms);
        int platforms1 = MinimumPlatforms.method1(
                new int[]{900, 1100, 1235},
                new int[]{1000, 1200, 1240},
                3);
        assertEquals(1, platforms1);
    }
}
