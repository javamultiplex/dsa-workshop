package com.javamultiplex.array.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Rohit Agarwal on 27/12/20 9:19 pm
 * @copyright www.javamultiplex.com
 */
public class RemoveDuplicateTest {

    @Test
    public void shouldRemoveDuplicateElementsByMethod1() {
        int size1 = RemoveDuplicate.method1(new int[]{1, 1, 2, 2}, 4);
        Assertions.assertEquals(2, size1);
        int size2 = RemoveDuplicate.method1(new int[]{1, 1, 1, 1}, 4);
        Assertions.assertEquals(1, size2);
        int size3 = RemoveDuplicate.method1(new int[]{1, 2, 2, 3}, 4);
        Assertions.assertEquals(3, size3);
        int size4 = RemoveDuplicate.method1(new int[]{1, 2, 3, 4}, 4);
        Assertions.assertEquals(4, size4);
    }


    @Test
    public void shouldRemoveDuplicateElementsByMethod2() {
        int size1 = RemoveDuplicate.method2(new int[]{1, 1, 2, 2}, 4);
        Assertions.assertEquals(2, size1);
        int size2 = RemoveDuplicate.method2(new int[]{1, 1, 1, 1}, 4);
        Assertions.assertEquals(1, size2);
        int size3 = RemoveDuplicate.method2(new int[]{1, 2, 2, 3}, 4);
        Assertions.assertEquals(3, size3);
        int size4 = RemoveDuplicate.method2(new int[]{1, 2, 3, 4}, 4);
        Assertions.assertEquals(4, size4);
    }
}
