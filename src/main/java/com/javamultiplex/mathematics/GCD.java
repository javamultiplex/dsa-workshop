package com.javamultiplex.mathematics;

/**
 * @author Rohit Agarwal on 13/12/20 9:59 pm
 * @copyright www.javamultiplex.com
 */
//Greatest Common Divisor
//aka HCF -> Highest Common Factors
public class GCD {

    //Euclidean Algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


    //Euclidean Algorithm
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    //Extended Euclidean Algorithm
    //ax+by=gcd(a,b), here x and y are coefficients
    public static int gcdExtended(int a, int b, int[] coefficients) {
        if (b == 0) {
            //x=1,y=0
            coefficients[0] = 1;
            coefficients[1] = 0;
            return a;
        } else {
            int[] newCoefficients = {1, 1};
            int gcd = gcdExtended(b, a % b, newCoefficients);
            //x=y1, y= x1-(a/b)*y1
            coefficients[0] = newCoefficients[1];
            coefficients[1] = newCoefficients[0] - (a / b) * newCoefficients[1];
            return gcd;
        }
    }
}
