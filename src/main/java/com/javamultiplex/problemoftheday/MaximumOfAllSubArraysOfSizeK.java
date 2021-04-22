package com.javamultiplex.problemoftheday;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Rohit Agarwal on 19/04/21 8:14 pm
 * @copyright www.javamultiplex.com
 */
public class MaximumOfAllSubArraysOfSizeK {

    //TC - O(n*k)
    public static ArrayList<Integer> method1(int[] arr, int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = i + 1; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            list.add(max);
        }
        return list;
    }


    //TC - O(n*k)
    public static ArrayList<Integer> method2(int[] arr, int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        int i;
        for (i = 0; i < k; i++) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        for (; i < n; i++) {
            list.add(arr[deque.peek()]);
            while ((!deque.isEmpty()) && deque.peek() <= i - k)
                deque.removeFirst();
            System.out.println(deque);
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

       // System.out.println(deque);

        return list;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = method1(new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6}, 9, 3);
//        System.out.println(list);

        ArrayList<Integer> list1 = method2(new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6}, 9, 3);
        System.out.println(list1);
    }
}
