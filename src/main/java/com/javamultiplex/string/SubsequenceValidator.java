package com.javamultiplex.string;

import java.util.List;

/**
 * @author Rohit Agarwal on 28/03/21 3:13 pm
 * @copyright www.javamultiplex.com
 */
public class SubsequenceValidator {

    public static boolean validateSubsequence(String input, String subsequence){
        List<String> subsequences = SubsequenceGenerator.subsequences(input);
        return subsequences.contains(subsequence);
    }
}
