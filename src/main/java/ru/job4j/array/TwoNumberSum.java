package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < array.length - 1) {
            if (array[i] + array[j] == target) {
                return new int[]{Math.min(i, j), Math.max(i, j)};
            } else {
                if (j > i) {
                    j--;
                }
            i++;
            }
        }
        return new int[0];
    }
}
