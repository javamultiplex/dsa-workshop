package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 02/02/21 11:15 pm
 * @copyright www.javamultiplex.com
 */
public class FrequencyOfNumberTest {

    @Test
    public void shouldFindFrequency() {
        int index = FrequencyOfNumber.method1(new int[]{1, 3, 4, 5, 5, 5, 5, 6}, 5);
        Assertions.assertEquals(4, index);
        int index1 = FrequencyOfNumber.method1(new int[]{1, 3, 3, 3, 5, 5, 6}, 3);
        Assertions.assertEquals(3, index1);
        int index2 = FrequencyOfNumber.method1(new int[]{1, 3, 3, 3, 3, 5, 5, 6}, 1);
        Assertions.assertEquals(1, index2);
        int index3 = FrequencyOfNumber.method1(new int[]{1, 3, 3, 3, 3, 5, 5, 6}, 6);
        Assertions.assertEquals(1, index3);
        int index4 = FrequencyOfNumber.method1(new int[]{1, 3, 3, 3, 4, 5, 5, 6}, 4);
        Assertions.assertEquals(1, index4);
        int index5 = FrequencyOfNumber.method1(new int[]{1, 3, 3, 3, 4, 4, 4, 5}, 4);
        Assertions.assertEquals(3, index5);
        int index6 = FrequencyOfNumber.method1(new int[]{1, 3, 3, 3, 4, 4, 4, 5}, 8);
        Assertions.assertEquals(0, index6);
    }
}
