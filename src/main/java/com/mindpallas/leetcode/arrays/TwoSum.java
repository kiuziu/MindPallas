package com.mindpallas.leetcode.arrays;

import java.util.HashMap;

public final class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }
}
