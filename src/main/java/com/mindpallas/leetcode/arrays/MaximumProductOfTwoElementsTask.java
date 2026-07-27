package com.mindpallas.leetcode.arrays;

import com.mindpallas.core.Task;

public class MaximumProductOfTwoElementsTask extends Task {

    @Override
    public String getName() {
        return "LC1464 – Maximum Product of Two Elements";
    }

    @Override
    public void run() {
        Solution s = new Solution();
        int result = s.maxProduct(new int[]{3, 4, 5, 2});
        System.out.println("Result: " + result);
    }
}
