package com.javamultiplex.mathematics;

import java.math.BigInteger;

/**
 * @author Rohit Agarwal on 17/12/20 9:47 pm
 * @copyright www.javamultiplex.com
 */
public class NumberOfDigitsInFactorialOfNumber {

    public static int method1(int n) {
        BigInteger factorial = Factorial.fact(n);
        return NumberOfDigitsInNumber.method2(factorial);
    }

    //floor(log(n!))+1
    //floor(log(n*n-1*n-2*...1))+1
    //floor(log(n)+log(n-1)+......log(1))+1
    public static int method2(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.log10(i);
        }
        return (int) Math.floor(sum) + 1;
    }
}
