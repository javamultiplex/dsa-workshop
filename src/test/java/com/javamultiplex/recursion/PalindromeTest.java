package com.javamultiplex.recursion;

import com.javamultiplex.dsa.recursion.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Rohit Agarwal on 19/03/21 11:46 pm
 * @copyright www.javamultiplex.com
 */
public class PalindromeTest {

    @Test
    public void shouldCheckPalindrome_iterative() {
        assertTrue(Palindrome.isPalindromeIterative(101));
        assertFalse(Palindrome.isPalindromeIterative(100));
        assertTrue(Palindrome.isPalindromeIterative(1001));
    }

    @Test
    public void shouldCheckPalindrome_recursive() {
        assertTrue(Palindrome.isPalindromeRecursive(101));
        assertFalse(Palindrome.isPalindromeRecursive(100));
        assertTrue(Palindrome.isPalindromeRecursive(1001));
    }
}
