package com.mindpallas.leetcode.strings;

import com.mindpallas.leetcode.LeetCodeTask;

public class ReverseStringTask implements LeetCodeTask {

    @Override
    public String name() {
        return "reverse-string";
    }

    @Override
    public void run() {
        System.out.println("Reverse: " + ReverseString.reverse("MindPallas"));
    }
}
