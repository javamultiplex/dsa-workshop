package com.javamultiplex.heap;

/**
 * @author Rohit Agarwal on 06/02/21 10:49 pm
 * @copyright www.javamultiplex.com
 */
public class Heap {

    //Time - O(n)
    public static void buildMaxHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
    }

    //Time - O(n)
    public static void buildMinHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            minHeapify(arr, n, i);
        }
    }

    //Time - O(log(n)), Space - O(log(n))
    public static void maxHeapify(int[] arr, int n, int index) {
        if (isLeaf(index, n)) {
            return;
        }
        int leftChild = leftChild(index);
        int rightChild = rightChild(index);
        if ((leftChild < n && arr[leftChild] > arr[index]) || (rightChild < n && arr[rightChild] > arr[index])) {
            if (rightChild < n && arr[rightChild] > arr[leftChild]) {
                swap(arr, index, rightChild);
                maxHeapify(arr, n, rightChild);
            } else {
                swap(arr, index, leftChild);
                maxHeapify(arr, n, leftChild);
            }
        }
    }

    public static void minHeapify(int[] arr, int n, int index) {
        if (isLeaf(index, n)) {
            return;
        }

        int leftChild = leftChild(index);
        int rightChild = rightChild(index);

        if ((leftChild < n && arr[leftChild] < arr[index]) || (rightChild < n && arr[rightChild] < arr[index])) {
            if (rightChild < n && arr[rightChild] < arr[leftChild]) {
                swap(arr, index, rightChild);
                minHeapify(arr, n, rightChild);
            } else {
                swap(arr, index, leftChild);
                minHeapify(arr, n, leftChild);
            }
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int leftChild(int index) {
        return 2 * index + 1;
    }

    private static int rightChild(int index) {
        return 2 * index + 2;
    }

    private static boolean isLeaf(int index, int n) {
        return leftChild(index) >= n && rightChild(index) >= n;
    }
}
