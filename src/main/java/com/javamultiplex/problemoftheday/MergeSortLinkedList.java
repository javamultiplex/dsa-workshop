package com.javamultiplex.problemoftheday;

/**
 * @author Rohit Agarwal on 17/04/21 4:43 pm
 * @copyright www.javamultiplex.com
 */

public class MergeSortLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int key) {
            this.data = key;
            next = null;
        }
    }

    static Node mergeSort(Node head) {
        int size = getSize(head);
        int[] arr = getArray(head, size);
        mergeSort(arr, 0, size - 1);
        int i = 0;
        Node temp = head;
        while (temp != null) {
            temp.data = arr[i];
            temp = temp.next;
            i++;
        }
        return head;
    }

    private static int[] getArray(Node head, int size) {
        int[] arr = new int[size];
        int i = 0;
        while (head != null) {
            arr[i] = head.data;
            head = head.next;
            i++;
        }
        return arr;
    }

    private static int getSize(Node head) {
        int size = 0;
        while (head != null) {
            size += 1;
            head = head.next;
        }
        return size;
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n = mid - left + 1;
        int m = right - mid;
        int[] output = new int[n + m];
        int j = left;
        int k = mid + 1;
        int l = 0;
        while (j <= mid && k <= right) {
            if (arr[j] <= arr[k]) {
                output[l++] = arr[j++];
            } else {
                output[l++] = arr[k++];
            }
        }

        while (j <= mid) {
            output[l++] = arr[j++];
        }

        while (k <= right) {
            output[l++] = arr[k++];
        }
        l = 0;
        for (int i = left; i <= right; i++) {
            arr[i] = output[l++];
        }
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(3);
        head.next.next = new Node(4);
        Node node = mergeSort(head);
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
