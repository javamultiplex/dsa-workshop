package com.javamultiplex.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Rohit Agarwal on 24/02/21 11:50 pm
 * @copyright www.javamultiplex.com
 */
public class RotateMatrix90DegreeTest {

    @Test
    public void shouldRotateAntiClockWise_method1() {
        assertArrayEquals(new int[][]{
                {3, 6, 9},
                {2, 5, 8},
                {1, 4, 7}
        }, RotateMatrix90Degree.antiClockWiseMethod1(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }));

        assertArrayEquals(new int[][]{
                {2, 4},
                {1, 3}
        }, RotateMatrix90Degree.antiClockWiseMethod1(new int[][]{
                {1, 2},
                {3, 4}
        }));
    }

    @Test
    public void shouldRotateAntiClockWise_method2() {
        assertArrayEquals(new int[][]{
                {3, 6, 9},
                {2, 5, 8},
                {1, 4, 7}
        }, RotateMatrix90Degree.antiClockWiseMethod2(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }));

        assertArrayEquals(new int[][]{
                {2, 4},
                {1, 3}
        }, RotateMatrix90Degree.antiClockWiseMethod2(new int[][]{
                {1, 2},
                {3, 4}
        }));
    }

    @Test
    public void shouldRotateClockWise_method1() {
        assertArrayEquals(new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        }, RotateMatrix90Degree.clockWiseMethod1(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }));

        assertArrayEquals(new int[][]{
                {3, 1},
                {4, 2}
        }, RotateMatrix90Degree.clockWiseMethod1(new int[][]{
                {1, 2},
                {3, 4}
        }));

        assertArrayEquals(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 12, 16}
        }, RotateMatrix90Degree.clockWiseMethod1(new int[][]{
                {4, 8, 12, 16},
                {3, 7, 11, 12},
                {2, 6, 10, 14},
                {1, 5, 9, 13}
        }));
    }

    @Test
    public void shouldRotateClockWise_method2() {
        assertArrayEquals(new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        }, RotateMatrix90Degree.clockWiseMethod2(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }));

        assertArrayEquals(new int[][]{
                {3, 1},
                {4, 2}
        }, RotateMatrix90Degree.clockWiseMethod2(new int[][]{
                {1, 2},
                {3, 4}
        }));

        assertArrayEquals(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 12, 16}
        }, RotateMatrix90Degree.clockWiseMethod2(new int[][]{
                {4, 8, 12, 16},
                {3, 7, 11, 12},
                {2, 6, 10, 14},
                {1, 5, 9, 13}
        }));
    }
}
