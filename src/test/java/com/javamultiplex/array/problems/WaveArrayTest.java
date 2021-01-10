package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 10/01/21 10:59 am
 * @copyright www.javamultiplex.com
 */
public class WaveArrayTest {

    @Test
    public void shouldConvertToWaveArray() {
        int[] arr = {1, 2, 3, 4, 5};
        WaveArray.convertToWave(arr, 5);
        Assertions.assertArrayEquals(new int[]{2, 1, 4, 3, 5}, arr);

        int[] arr1 = {2, 4, 7, 8, 9, 10};
        WaveArray.convertToWave(arr1, 6);
        Assertions.assertArrayEquals(new int[]{4, 2, 8, 7, 10, 9}, arr1);
    }
}
