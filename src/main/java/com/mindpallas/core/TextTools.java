package com.mindpallas.util;

public class TextTools {

    public static boolean isPalindrome(String s) {
        var clean = s.replaceAll("\\s+", "").toLowerCase();
        return clean.contentEquals(new StringBuilder(clean).reverse());
    }
}
