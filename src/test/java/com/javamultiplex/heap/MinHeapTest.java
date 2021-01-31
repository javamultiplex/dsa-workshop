package com.javamultiplex.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Rohit Agarwal on 31/01/21 9:40 pm
 * @copyright www.javamultiplex.com
 */
public class MinHeapTest {

    @Test
    public void shouldInsertElementsIntoHeap() {
        MinHeap minHeap = new MinHeap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
        assertArrayEquals(new int[]{3, 5, 6, 9, 84, 19, 17, 22, 10}, minHeap.getHeap());
        int min = minHeap.extractMin();
        assertEquals(3, min);
        assertArrayEquals(new int[]{5, 9, 6, 10, 84, 19, 17, 22}, minHeap.getHeap());
        int min1 = minHeap.extractMin();
        assertEquals(5, min1);
        assertArrayEquals(new int[]{6, 9, 17, 10, 84, 19, 22}, minHeap.getHeap());
        int min2 = minHeap.extractMin();
        assertEquals(6, min2);
        assertArrayEquals(new int[]{9, 10, 17, 22, 84, 19}, minHeap.getHeap());
    }
}
