package com.mindpallas.leetcode.math;

import com.mindpallas.leetcode.LeetCodeTask;

public class MaxProductTask implements LeetCodeTask {

    @Override
    public String name() {
        return "max-product-two-digits";
    }

    @Override
    public void run() {
        int result = MaxProductOfTwoDigits.maxProduct(1992345);
        System.out.println("Max product of two digits: " + result);
    }
}
