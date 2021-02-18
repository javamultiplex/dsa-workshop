package com.javamultiplex.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 18/02/21 10:47 pm
 * @copyright www.javamultiplex.com
 */
public class MatrixTransposeTest {

    @Test
    public void shouldTransposeMatrix() {
        assertArrayEquals(new int[][]
                {
                        {1, 4},
                        {2, 5},
                        {3, 9}
                }, MatrixTranspose.transpose(new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 9}
                }));

        assertArrayEquals(new int[][]
                {
                        {1, 4, 8},
                        {2, 5, 10},
                        {3, 9, 11}
                }, MatrixTranspose.transpose(new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 9},
                        {8, 10, 11}
                }));

        assertArrayEquals(new int[][]
                {
                        {1, 4, 8},
                        {2, 5, 10}
                }, MatrixTranspose.transpose(new int[][]
                {
                        {1, 2},
                        {4, 5},
                        {8, 10}
                }));
    }

}
