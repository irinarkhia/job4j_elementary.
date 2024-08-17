package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return max(max(left, right), third);
    }

    public static int max(int left, int right, int third, int forth) {
        return max(max(max(left, right), third), forth);
    }
}
