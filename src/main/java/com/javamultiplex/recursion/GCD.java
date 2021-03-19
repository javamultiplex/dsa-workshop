package com.javamultiplex.recursion;

/**
 * @author Rohit Agarwal on 20/03/21 12:17 am
 * @copyright www.javamultiplex.com
 */
public class GCD {
    public static int GCD(int a, int b){
        if (b==0){
            return a;
        }else {
            return GCD(b, a%b);
        }
    }
}
