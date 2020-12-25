package com.javamultiplex.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 26/12/20 12:00 am
 * @copyright www.javamultiplex.com
 */
public class TrappingRainWaterTest {

    @Test
    public void shouldCalculateMaxWater() {
        int result1 = TrappingRainWater.maxWater(new int[]{2, 0, 2}, 3);
        assertEquals(2, result1);
        int result2 = TrappingRainWater.maxWater(new int[]{3, 0, 2, 0, 4}, 5);
        assertEquals(7, result2);
        int result3 = TrappingRainWater.maxWater(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, 12);
        assertEquals(6, result3);
        int result4 = TrappingRainWater.maxWater(new int[]{7,4,0,9}, 4);
        assertEquals(10, result4);
        int result5 = TrappingRainWater.maxWater(new int[]{3,0,0,2,0,4}, 6);
        assertEquals(10, result5);
        int result6 = TrappingRainWater.maxWater(new int[]{6,9,9}, 3);
        assertEquals(0, result6);

    }
}
