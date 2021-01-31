package com.javamultiplex.heap;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 31/01/21 9:27 pm
 * @copyright www.javamultiplex.com
 */
public class MinHeap {
    private final int[] heap;
    private final int maxSize;
    private int size;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.heap = new int[maxSize + 1];
        heap[0] = Integer.MIN_VALUE;
    }

    //Time - O(n)
    public int[] getHeap() {
        return Arrays.copyOfRange(heap, 1, size + 1);
    }

    //Time - O(log(n))
    public void insert(int element) {
        if (size == maxSize) {
            throw new OutOfMemoryError("Heap is full");
        }
        size = size + 1;
        int current = size;
        heap[current] = element;
        int parent = parent(current);
        while (heap[parent] > heap[current]) {
            swap(parent, current);
            current = parent;
            parent = parent(current);
        }
    }

    //Time - O(log(n))
    public int extractMin() {
        int min = heap[1];
        heap[1] = heap[size];
        size = size - 1;
        minHeapify(1);
        return min;
    }

    private void minHeapify(int index) {
        if (isLeaf(index)) {
            return;
        }

        if (heap[index] > heap[leftChild(index)] || heap[index] > heap[rightChild(index)]) {
            if (heap[leftChild(index)] < heap[rightChild(index)]) {
                swap(index, leftChild(index));
                minHeapify(leftChild(index));
            } else {
                swap(index, rightChild(index));
                minHeapify(rightChild(index));
            }
        }
    }

    private int parent(int index) {
        return index / 2;
    }

    private int leftChild(int index) {
        return 2 * index;
    }

    private int rightChild(int index) {
        return 2 * index + 1;
    }

    private boolean isLeaf(int index) {
        return leftChild(index) > size && rightChild(index) > size;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

}
