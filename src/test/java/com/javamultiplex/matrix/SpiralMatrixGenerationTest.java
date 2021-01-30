package com.javamultiplex.matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 30/01/21 5:10 pm
 * @copyright www.javamultiplex.com
 */
public class SpiralMatrixGenerationTest {

    @Test
    public void shouldGenerateSpiralMatrix() {
        int[][] mat = SpiralMatrixGeneration.generate(3);
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, mat[0]);
        Assertions.assertArrayEquals(new int[]{8, 9, 4}, mat[1]);
        Assertions.assertArrayEquals(new int[]{7, 6, 5}, mat[2]);

    }
}
