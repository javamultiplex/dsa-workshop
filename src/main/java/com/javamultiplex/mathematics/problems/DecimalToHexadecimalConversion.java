package com.javamultiplex.mathematics.problems;

/**
 * @author Rohit Agarwal on 17/02/21 11:03 pm
 * @copyright www.javamultiplex.com
 */
public class DecimalToHexadecimalConversion {
    public static String doConversion(int number) {
        StringBuilder builder = new StringBuilder();
        char ch;
        while (number != 0) {
            int rem = number % 16;
            char hexadecimalCharacter = getHexadecimalCharacter(rem);
            if (hexadecimalCharacter == '\u0000') {
                builder.append(rem);
            } else {
                builder.append(hexadecimalCharacter);
            }
            number = number / 16;
        }
        return builder.reverse().toString();
    }

    private static char getHexadecimalCharacter(int rem) {
        char ch = '\u0000';
        switch (rem) {
            case 10:
                ch = 'a';
                break;
            case 11:
                ch = 'b';
                break;
            case 12:
                ch = 'c';
                break;
            case 13:
                ch = 'd';
                break;
            case 14:
                ch = 'e';
                break;
            case 15:
                ch = 'f';
                break;
        }
        return ch;
    }
}
