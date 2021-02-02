package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 02/02/21 11:00 pm
 * @copyright www.javamultiplex.com
 */
public class LeftMostIndexTest {

    @Test
    public void shouldFindLeftMostIndex() {
        int index = LeftMostIndex.method1(new int[]{1, 3, 4, 5, 5, 5, 5, 6}, 5);
        Assertions.assertEquals(3, index);
        int index1 = LeftMostIndex.method1(new int[]{1, 3, 3, 3, 3, 5, 5, 6}, 3);
        Assertions.assertEquals(1, index1);
        int index2 = LeftMostIndex.method1(new int[]{1, 3, 3, 3, 3, 5, 5, 6}, 1);
        Assertions.assertEquals(0, index2);
        int index3 = LeftMostIndex.method1(new int[]{1, 3, 3, 3, 3, 5, 5, 6}, 6);
        Assertions.assertEquals(7, index3);
        int index4 = LeftMostIndex.method1(new int[]{1, 3, 3, 3, 4, 5, 5, 6}, 4);
        Assertions.assertEquals(4, index4);
        int index5 = LeftMostIndex.method1(new int[]{1, 3, 3, 3, 4, 5, 5, 6}, 9);
        Assertions.assertEquals(-1, index5);
    }
}
