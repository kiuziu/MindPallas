package com.mindpallas.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void testTypical() {
        int[] nums = {2, 7, 11, 15};
        int[] result = TwoSum.twoSum(nums, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testNoSolution() {
        int[] nums = {1, 2, 3};
        int[] result = TwoSum.twoSum(nums, 100);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void testDuplicates() {
        int[] nums = {3, 3};
        int[] result = TwoSum.twoSum(nums, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}
