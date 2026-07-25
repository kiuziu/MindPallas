package com.mindpallas.leetcode.strings;

public final class ReverseString {

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
