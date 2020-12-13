package com.javamultiplex.mathematics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 12/12/20 6:15 pm
 * @copyright www.javamultiplex.com
 */
public class NumberOfDigitsInNumberTest {

    @Test
    public void shouldTestMethod1(){
        int result1 = NumberOfDigitsInNumber.method1(2020);
        assertEquals(4, result1);
        int result2 = NumberOfDigitsInNumber.method1(1567);
        assertEquals(4, result2);
        int result3 = NumberOfDigitsInNumber.method1(267);
        assertEquals(3, result3);
        int result4 = NumberOfDigitsInNumber.method1(58964);
        assertEquals(5, result4);
    }

    @Test
    public void shouldTestMethod2(){
        int result1 = NumberOfDigitsInNumber.method2(2020);
        assertEquals(4, result1);
        int result2 = NumberOfDigitsInNumber.method2(1567);
        assertEquals(4, result2);
        int result3 = NumberOfDigitsInNumber.method2(267);
        assertEquals(3, result3);
        int result4 = NumberOfDigitsInNumber.method2(58964);
        assertEquals(5, result4);
    }
}
