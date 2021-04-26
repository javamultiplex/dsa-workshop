package com.javamultiplex.dsa.mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rohit Agarwal on 25/04/21 4:30 pm
 * @copyright www.javamultiplex.com
 */
public class SieveAlgorithm {

    //TC - O(n*sqrt(n))
    public static List<Integer> v1(int n) {
        List<Integer> output = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (Prime.v3(i)) {
                output.add(i);
            }
        }
        return output;
    }


    public static List<Integer> v2(int n) {
        List<Integer> output = new ArrayList<>();
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                int j = 2 * i;
                while (j <= n) {
                    prime[j] = false;
                    j = j + i;
                }

            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                output.add(i);
            }
        }
        return output;
    }

    //TC - O(nlog(log(n)))
    public static List<Integer> v3(int n) {
        List<Integer> output = new ArrayList<>();
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                int j = i * i;  //Replaced 2*i with i*i
                while (j <= n) {
                    prime[j] = false;
                    j = j + i;
                }

            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                output.add(i);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        List<Integer> list = v2(5);
        System.out.println(list);

        List<Integer> list1 = v2(50);
        System.out.println(list1);
    }
}
