package com.javamultiplex.mathematics.problems;

import com.javamultiplex.mathematics.problems.NumberOfDigitsInNumber;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

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
        int result5 = NumberOfDigitsInNumber.method2(1000);
        assertEquals(4, result5);
        int result6 = NumberOfDigitsInNumber.method2(101);
        assertEquals(3, result6);
    }

    @Test
    public void shouldTestMethod1WithBigInteger(){
        int result1 = NumberOfDigitsInNumber.method1(BigInteger.valueOf(2020));
        assertEquals(4, result1);
        int result2 = NumberOfDigitsInNumber.method1(BigInteger.valueOf(1567));
        assertEquals(4, result2);
        int result3 = NumberOfDigitsInNumber.method1(BigInteger.valueOf(267));
        assertEquals(3, result3);
        int result4 = NumberOfDigitsInNumber.method1(BigInteger.valueOf(58964));
        assertEquals(5, result4);
        int result5 = NumberOfDigitsInNumber.method2(BigInteger.valueOf(1000));
        assertEquals(4, result5);
        int result6 = NumberOfDigitsInNumber.method2(BigInteger.valueOf(101));
        assertEquals(3, result6);
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
        int result5 = NumberOfDigitsInNumber.method2(1000);
        assertEquals(4, result5);
        int result6 = NumberOfDigitsInNumber.method2(101);
        assertEquals(3, result6);
    }

    @Test
    public void shouldTestMethod2WithBigInteger(){
        int result1 = NumberOfDigitsInNumber.method2(BigInteger.valueOf(2020));
        assertEquals(4, result1);
        int result2 = NumberOfDigitsInNumber.method2(BigInteger.valueOf(1567));
        assertEquals(4, result2);
        int result3 = NumberOfDigitsInNumber.method2(BigInteger.valueOf(267));
        assertEquals(3, result3);
        int result4 = NumberOfDigitsInNumber.method2(BigInteger.valueOf(58964));
        assertEquals(5, result4);
        int result5 = NumberOfDigitsInNumber.method2(BigInteger.valueOf(1000));
        assertEquals(4, result5);
        int result6 = NumberOfDigitsInNumber.method2(BigInteger.valueOf(101));
        assertEquals(3, result6);
    }


}
