package com.javamultiplex.string;

/**
 * @author Rohit Agarwal on 30/03/21 11:33 pm
 * @copyright www.javamultiplex.com
 */
public class StringValidation {

    public static boolean validate(String str) {
        int length = str.length();
        return length >= 10
                && isContainsAtLeastOneNumericCharacter(str)
                && isContainsAtLeastOneUpperCaseCharacter(str)
                && isContainsAtLeastOneLowerCaseCharacter(str)
                && isContainsRequiredSpecialCharacters(str);
    }

    private static boolean isContainsAtLeastOneUpperCaseCharacter(String input) {
        int length = input.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (ch >= 65 && ch <= 90) {
                count++;
            }
        }
        return count > 0;
    }

    private static boolean isContainsAtLeastOneLowerCaseCharacter(String input) {
        int length = input.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (ch >= 97 && ch <= 122) {
                count++;
            }
        }
        return count > 0;
    }

    private static boolean isContainsAtLeastOneNumericCharacter(String input) {
        int length = input.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (ch >= 48 && ch <= 57) {
                count++;
            }
        }
        return count > 0;
    }

    private static boolean isContainsRequiredSpecialCharacters(String input) {
        int length = input.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (ch == '@' || ch == '#' || ch == '$' || ch == '-' || ch == '*') {
                count++;
            }
        }
        return count > 0;
    }
}
