package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (i < array.length - 1) {
            if (array[i] + array[j] == target) {
                return new int[]{Math.min(i, j), Math.max(i, j)};
            } else {
                if (j < array.length - 1) {
                    j++;
                } else {
                    i++;
                    j = i + 1;
                }
            }
        }
        return new int[0];
    }
}
