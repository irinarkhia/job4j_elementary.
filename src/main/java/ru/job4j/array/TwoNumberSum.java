package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (target == array[j] + array[i]) {
                    return new int[]{Math.min(i, j), Math.max(i, j)};
                }
            }
        }
        return new int[0];
    }
}
