package com.mindpallas.leetcode.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MaxProductOfTwoDigitsTest {

    @Test
    void testTypical() {
        assertEquals(81, MaxProductOfTwoDigits.maxProduct(1992345));
    }

    @Test
    void testSingleDigit() {
        assertEquals(0, MaxProductOfTwoDigits.maxProduct(7));
    }

    @Test
    void testTwoDigits() {
        assertEquals(18, MaxProductOfTwoDigits.maxProduct(29));
    }

    @Test
    void testZeros() {
        assertEquals(0, MaxProductOfTwoDigits.maxProduct(1000));
    }
}
