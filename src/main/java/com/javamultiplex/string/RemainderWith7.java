package com.javamultiplex.string;

/**
 * @author Rohit Agarwal on 14/04/21 10:13 pm
 * @copyright www.javamultiplex.com
 */
public class RemainderWith7 {
    public static int remainderWith7(String num) {
        int integer = Integer.parseInt(num);
        return integer % 7;
    }

    public static void main(String[] args) {
        System.out.println(remainderWith7("8"));
    }
}
