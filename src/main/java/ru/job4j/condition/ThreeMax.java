package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first <= second && second >= third) {
            result = second;
        }
        if (second <= third && third >= first) {
            result = third;
        }
        return result;
    }

}
