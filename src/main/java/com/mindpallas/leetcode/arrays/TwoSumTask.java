package com.mindpallas.leetcode.arrays;

import com.mindpallas.leetcode.LeetCodeTask;

public class TwoSumTask implements LeetCodeTask {

    @Override
    public String name() {
        return "two-sum";
    }

    @Override
    public void run() {
        int[] nums = {2, 7, 11, 15};
        int[] result = TwoSum.twoSum(nums, 9);
        System.out.println("TwoSum result: [" + result[0] + ", " + result[1] + "]");
    }
}
