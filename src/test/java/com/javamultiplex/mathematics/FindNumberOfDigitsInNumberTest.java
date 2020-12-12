package com.javamultiplex.mathematics;

import com.javamultiplex.mathematics.FindNumberOfDigitsInNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohit Agarwal on 12/12/20 6:15 pm
 * @copyright www.javamultiplex.com
 */
public class FindNumberOfDigitsInNumberTest {

    private FindNumberOfDigitsInNumber findNumberOfDigitsInNumber;

    @BeforeEach
    void setUp() {
        findNumberOfDigitsInNumber=new FindNumberOfDigitsInNumber();
    }

    @Test
    public void shouldTestMethod1(){
        int result1 = findNumberOfDigitsInNumber.method1(2020);
        assertEquals(4, result1);
        int result2 = findNumberOfDigitsInNumber.method1(1567);
        assertEquals(4, result2);
        int result3 = findNumberOfDigitsInNumber.method1(267);
        assertEquals(3, result3);
        int result4 = findNumberOfDigitsInNumber.method1(58964);
        assertEquals(5, result4);
    }

    @Test
    public void shouldTestMethod2(){
        int result1 = findNumberOfDigitsInNumber.method2(2020);
        assertEquals(4, result1);
        int result2 = findNumberOfDigitsInNumber.method2(1567);
        assertEquals(4, result2);
        int result3 = findNumberOfDigitsInNumber.method2(267);
        assertEquals(3, result3);
        int result4 = findNumberOfDigitsInNumber.method2(58964);
        assertEquals(5, result4);
    }
}
