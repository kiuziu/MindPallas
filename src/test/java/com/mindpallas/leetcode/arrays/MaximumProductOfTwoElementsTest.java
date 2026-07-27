package com.mindpallas.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumProductOfTwoElementsTest {

    @Test
    public void testExample1() {
        MaximumProductOfTwoElements s = new MaximumProductOfTwoElements();
        assertEquals(12, s.maxProduct(new int[]{3, 4, 5, 2}));
    }

    @Test
    public void testExample2() {
        MaximumProductOfTwoElements s = new MaximumProductOfTwoElements();
        assertEquals(16, s.maxProduct(new int[]{1, 5, 4, 5}));
    }

    @Test
    public void testExample3() {
        MaximumProductOfTwoElements s = new MaximumProductOfTwoElements();
        assertEquals(0, s.maxProduct(new int[]{1, 1}));
    }
}
