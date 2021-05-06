package com.javamultiplex.dsa.bitmagic;

/**
 * @author Rohit Agarwal on 06/05/21 11:39 pm
 * @copyright www.javamultiplex.com
 */
public class BinaryToGrayCodeConverter {
    /**
     * Binary to Gray conversion :
     * <p>
     * The Most Significant Bit (MSB) of the gray code is always equal to the MSB of the given binary code.
     * Other bits of the output gray code can be obtained by XORing binary code bit at that index and previous index.
     */
    public static int v1(int n) {
        int sum = 0;
        int i = 0;
        while (n != 0) {
            int xor = (n & 1) ^ ((n >> 1) & 1);
            sum += xor * Math.pow(2, i);
            n = n >> 1;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(v1(7));
        System.out.println(v1(10));
    }
}
