package com.mindpallas.core;

import com.mindpallas.leetcode.LeetCodeRegistry;
import com.mindpallas.leetcode.math.MaxProductTask;
import com.mindpallas.leetcode.math.MaximumProductOfThreeNumbers;
import com.mindpallas.leetcode.strings.TokenizerTask;
import com.mindpallas.leetcode.arrays.TwoSumTask;
import com.mindpallas.leetcode.arrays.MaximumProductOfTwoElements;
import com.mindpallas.leetcode.strings.ReverseStringTask;

public class App {
    public static void main(String[] args) {

        // Register tasks
        LeetCodeRegistry.register(new MaxProductTask());
        LeetCodeRegistry.register(new TokenizerTask());
        LeetCodeRegistry.register(new MaximumProductOfThreeNumbers());
        LeetCodeRegistry.register(new TwoSumTask());
        LeetcodeRegistry.register(new MaximumProductOfTwoElements());
        LeetCodeRegistry.register(new ReverseStringTask());

        // List all tasks
        LeetCodeRegistry.list();

        // Run a specific task
        System.out.println("\nRunning task: reverse-string\n");
        LeetCodeRegistry.run("reverse-string");
    }
}
