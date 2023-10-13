package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int supply = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = supply;
        }
        return array;
    }
}
