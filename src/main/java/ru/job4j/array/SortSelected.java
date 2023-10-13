package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int minNumber = MinDiapason.findMin(data, i, data.length - 1);
            int indexOfMin = FindLoop.indexInRange(data, minNumber, i, data.length - 1);
            SwitchArray.swap(data, indexOfMin, i);
        }
        return data;
    }
}
