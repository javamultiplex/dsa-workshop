package com.javamultiplex.mathematics;

/**
 * @author Rohit Agarwal on 12/12/20 6:11 pm
 * @copyright www.javamultiplex.com
 */
public class FindNumberOfDigitsInNumber {

    //O(digitCount)
    public int method1(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    //O(1)
    public int method2(int number) {
        return (int) Math.ceil(Math.log10(number));
    }
}
