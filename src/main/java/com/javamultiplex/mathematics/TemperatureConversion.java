package com.javamultiplex.mathematics;

/**
 * @author Rohit Agarwal on 15/12/20 10:04 pm
 * @copyright www.javamultiplex.com
 */
public class TemperatureConversion {

    public static double cToF(int C) {
        return Math.floor(C * ((double) 9 / 5) + 32);
    }

    public static double fToC(int F) {
        return Math.floor((F - 32) * ((double) 5 / 9));
    }

}
