package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 13/02/21 11:39 pm
 * @copyright www.javamultiplex.com
 */
public class SearchElementInSortedAndRotatedArrayTest {

    @Test
    public void shouldSearchElement() {
        int index = SearchElementInSortedAndRotatedArray.search(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, 3);
        assertEquals(8, index);
        int index2 = SearchElementInSortedAndRotatedArray.search(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, 30);
        assertEquals(-1, index2);
        int index3 = SearchElementInSortedAndRotatedArray.search(new int[]{30, 40, 50, 10, 20}, 10);
        assertEquals(3, index3);
        int index4 = SearchElementInSortedAndRotatedArray.search(new int[]{3, 1, 2}, 1);
        assertEquals(1, index4);
        int index5 = SearchElementInSortedAndRotatedArray.search(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, 10);
        assertEquals(5, index5);
    }
}
