package com.javamultiplex.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Rohit Agarwal on 18/02/21 11:19 pm
 * @copyright www.javamultiplex.com
 */
public class SymmetricMatrixTest {
    @Test
    public void shouldTestSymmetricMatrix() {
        assertFalse(SymmetricMatrix.isSymmetricMatrix(new int[][]
                {
                        {1, 1},
                        {1, 2},
                        {-1, 0}

                }));

        assertFalse(SymmetricMatrix.isSymmetricMatrix(new int[][]
                {
                        {1, 1, 8},
                        {1, 2, 9},
                        {-1, 0, 1}

                }));
        assertTrue(SymmetricMatrix.isSymmetricMatrix(new int[][]
                {
                        {1, 1, -1},
                        {1, 2, 0},
                        {-1, 0, 5}

                }));
        assertTrue(SymmetricMatrix.isSymmetricMatrix(new int[][]
                {
                        {1, 2, 17},
                        {2, 5, -11},
                        {17, -11, 9}

                }));
    }
}
