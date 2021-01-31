package com.javamultiplex.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 31/01/21 5:25 pm
 * @copyright www.javamultiplex.com
 */
public class MaxHeapTest {

    @Test
    public void shouldInsertElementsIntoHeap() {
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        assertArrayEquals(new int[]{84, 22, 19, 17, 10, 5, 6, 3, 9}, maxHeap.getHeap());
        int max = maxHeap.extractMax();
        assertEquals(84, max);
        assertArrayEquals(new int[]{22, 17, 19, 9, 10, 5, 6, 3}, maxHeap.getHeap());
        int max1 = maxHeap.extractMax();
        assertEquals(22, max1);
        assertArrayEquals(new int[]{19, 17, 6, 9, 10, 5, 3}, maxHeap.getHeap());
        int max2 = maxHeap.extractMax();
        assertEquals(19, max2);
        assertArrayEquals(new int[]{17, 10, 6, 9, 3, 5}, maxHeap.getHeap());
    }
}
