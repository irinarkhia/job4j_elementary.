package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max3(int left, int right, int third) {
        return third > max(left, right) ? third : max(left, right);
    }

    public static int max4(int left, int right, int third, int forth) {
        return forth > max3(left, right, third) ? forth : max3(left, right, third);
    }
}
