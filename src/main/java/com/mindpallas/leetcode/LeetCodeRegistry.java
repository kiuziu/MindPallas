package com.mindpallas.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public final class LeetCodeRegistry {

    private static final Map<String, LeetCodeTask> tasks = new LinkedHashMap<>();

    public static void register(LeetCodeTask task) {
        tasks.put(task.name(), task);
    }

    public static void run(String name) {
        var task = tasks.get(name);
        if (task == null) {
            System.out.println("Task not found: " + name);
            return;
        }
        task.run();
    }

    public static void list() {
        System.out.println("Registered LeetCode tasks:");
        tasks.keySet().forEach(System.out::println);
    }
}
