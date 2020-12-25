package com.javamultiplex.mathematics;

/**
 * @author Rohit Agarwal on 25/12/20 7:27 pm
 * @copyright www.javamultiplex.com
 */
public class ExtendedEuclideanAlgorithm {

    //ax+by=gcd(a,b), here x and y are coefficients
    public static int gcd(int a, int b, int[] coefficients) {
        if (b == 0) {
            //x=1,y=0
            coefficients[0] = 1;
            coefficients[1] = 0;
            return a;
        } else {
            int[] newCoefficients = {1, 1};
            int gcd = gcd(b, a % b, newCoefficients);
            //x=y1, y= x1-(a/b)*y1
            coefficients[0] = newCoefficients[1];
            coefficients[1] = newCoefficients[0] - (a / b) * newCoefficients[1];
            return gcd;
        }
    }
}
