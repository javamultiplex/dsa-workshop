package com.javamultiplex.dsa.mathematics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 25/04/21 3:16 pm
 * @copyright www.javamultiplex.com
 */
//Print all divisors in ascending order
public class Divisors {

    //TC - theta(n)
    public static List<Integer> v1(int n) {
        List<Integer> output = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                output.add(i);
            }
        }
        return output;
    }

    //TC - theta(sqrt(n)) but result is not in sorted order
    public static List<Integer> v2(int n) {
        List<Integer> output = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                output.add(i);
                if (i != n / i) {
                    output.add(n / i);
                }
            }
        }
        return output;
    }

    //TC - theta(sqrt(n)) but result is in sorted order
    public static List<Integer> v3(int n) {
        List<Integer> output = new ArrayList<>();
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0) {
                output.add(i);
            }
        }

        for (i = (int) Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0) {
                output.add(n / i);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        List<Integer> list = v1(30);
        System.out.println(list);

        List<Integer> list1 = v2(30);
        System.out.println(list1);

        List<Integer> list2 = v3(30);
        System.out.println(list2);
    }


}
