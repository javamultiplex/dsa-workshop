package com.javamultiplex.dsa.mathematics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rohit Agarwal on 25/04/21 2:21 pm
 * @copyright www.javamultiplex.com
 */
public class PrimeFactors {
    public static List<Integer> v1(int n) {
        List<Integer> output = new ArrayList<>();
        //TC - O(n*sqrt(n)*log(n))
        for (int i = 1; i <= n; i++) {
            //TC - O(sqrt(n))
            if (Prime.v3(i)) {
                int x = i;
                //TC - O(log(n))
                while (n % x == 0) {
                    output.add(i);
                    x = x * x;
                }
            }
        }
        return output;
    }

    public static List<Integer> v2(int n) {
        List<Integer> output = new ArrayList<>();
        if (n <= 1) {
            return output;
        }

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                output.add(i);
                n = n / i;
            }
        }
        if (n > 1) {
            output.add(n);
        }
        return output;
    }

    public static List<Integer> v3(int n) {
        List<Integer> output = new ArrayList<>();
        if (n <= 1) {
            return output;
        }

        while (n % 2 == 0) {
            output.add(2);
            n = n / 2;
        }

        while (n % 3 == 0) {
            output.add(3);
            n = n / 3;
        }

        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                output.add(i);
                n = n / i;
            }

            while (n % (i + 2) == 0) {
                output.add(i + 2);
                n = n / (i + 2);
            }
        }

        if (n > 3) {
            output.add(n);
        }
        return output;
    }

    public static void main(String[] args) {
        List<Integer> list = v1(12);
        System.out.println(list);
        List<Integer> list1 = v1(13);
        System.out.println(list1);
        List<Integer> list2 = v3(450);
        System.out.println(list2);

        List<Integer> list3 = v2(12);
        System.out.println(list3);
        List<Integer> list4 = v2(13);
        System.out.println(list4);
        List<Integer> list5 = v2(450);
        System.out.println(list5);

        List<Integer> list6 = v3(12);
        System.out.println(list6);
        List<Integer> list7 = v3(13);
        System.out.println(list7);
        List<Integer> list8 = v3(450);
        System.out.println(list8);


    }
}
