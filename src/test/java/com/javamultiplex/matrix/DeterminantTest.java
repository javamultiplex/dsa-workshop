package com.javamultiplex.matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 24/02/21 12:03 am
 * @copyright www.javamultiplex.com
 */
public class DeterminantTest {

    @Test
    public void shouldFindDeterminant_2X2Matrix() {
        Assertions.assertEquals(-2, Determinant.determinant(new int[][]{
                {1, 2},
                {3, 4}
        }));
    }

    @Test
    public void shouldFindDeterminant_3X3Matrix() {
        Assertions.assertEquals(-306, Determinant.determinant(new int[][]{
                {6, 1, 1},
                {4, -2, 5},
                {2, 8, 7}
        }));
    }

    @Test
    public void shouldFindDeterminant_4X4Matrix() {
        Assertions.assertEquals(20, Determinant.determinant(new int[][]{
                {5, -7, 2, 2},
                {0, 3, 0, -4},
                {-5, -8, 0, 3},
                {0, 5, 0, -6}
        }));
    }
}
