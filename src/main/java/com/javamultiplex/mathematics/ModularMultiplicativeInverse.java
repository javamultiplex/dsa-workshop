package com.javamultiplex.mathematics;

/**
 * @author Rohit Agarwal on 22/12/20 10:45 pm
 * @copyright www.javamultiplex.com
 */
public class ModularMultiplicativeInverse {

    public static int modInverseByExtendedEuclideanAlgo(int a, int m) {
        int[] coefficients = {1, 1};
        if (GCD.gcdExtended(a, m, coefficients) == 1) {
            // multiplicative inverse should be between 0 to m-1
            return (coefficients[0] % m + m) % m;
        } else {
            return -1;
        }
    }

    public static int modInverseByBruteForce(int a, int m) {
        for (int i = 0; i < m; i++) {
            if ((a * i) % m == 1) {
                return i;
            }
        }
        return -1;
    }
}
