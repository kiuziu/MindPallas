package com.mindpallas.leetcode.math;

public final class MaxProductOfTwoDigits {

    public static int maxProduct(int n) {
        int largest = 0;
        int secondLargest = 0;

        while (n > 0) {
            int digit = n % 10;
            n /= 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest) {
                secondLargest = digit;
            }
        }

        return largest * secondLargest;
    }
}
