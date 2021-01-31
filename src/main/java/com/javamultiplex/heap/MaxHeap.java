package com.javamultiplex.heap;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 31/01/21 5:04 pm
 * @copyright www.javamultiplex.com
 */
public class MaxHeap {
    private final int[] heap;
    private int size;
    private final int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        heap = new int[maxSize + 1];
        heap[0] = Integer.MAX_VALUE;
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
        while (heap[parent] < heap[current]) {
            swap(parent, current);
            current = parent;
            parent = parent(current);
        }

    }

    //Time - O(log(n))
    public int extractMax() {
        if (size == 0) {
            throw new RuntimeException("Heap is empty");
        }
        int max = heap[1];
        heap[1] = heap[size];
        size = size - 1;
        maxHeapify(1);
        return max;
    }

    //Time - O(n)
    public int[] getHeap() {
        return Arrays.copyOfRange(heap, 1, size + 1);
    }

    private void maxHeapify(int index) {
        if (isLeaf(index)) {
            return;
        }

        if (heap[index] < heap[leftChild(index)] || heap[index] < heap[rightChild(index)]) {
            if (heap[leftChild(index)] > heap[rightChild(index)]) {
                swap(index, leftChild(index));
                maxHeapify(leftChild(index));
            } else {
                swap(index, rightChild(index));
                maxHeapify(rightChild(index));
            }
        }

    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
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
}
