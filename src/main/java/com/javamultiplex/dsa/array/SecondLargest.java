package com.javamultiplex.dsa.array;

/**
 * @author Rohit Agarwal on 02/06/21 11:43 pm
 * @copyright www.javamultiplex.com
 */
public class SecondLargest {

    public static int v1(int[] arr) {
        int n = arr.length;
        int largest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }

        int secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[largest]) {
                if (secondLargest == -1) {
                    secondLargest = i;
                }

                if (arr[i] > arr[secondLargest]) {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }

    public static int v2(int[] arr) {
        int n = arr.length;
        int largest = 0, secondLargest = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (arr[i] < arr[largest]) {
                if (secondLargest == -1 || arr[i] > arr[secondLargest]) {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(v1(new int[]{10, 5, 8, 20}));
        System.out.println(v1(new int[]{20, 10, 20, 8, 12}));
        System.out.println(v1(new int[]{10, 10, 10}));
        System.out.println("********");
        System.out.println(v2(new int[]{10, 5, 8, 20}));
        System.out.println(v2(new int[]{20, 10, 20, 8, 12}));
        System.out.println(v2(new int[]{10, 10, 10}));
    }

}
