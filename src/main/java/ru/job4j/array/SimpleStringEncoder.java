package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        result = result + symbol;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                symbol = input.charAt(i);
                if (counter != 1) {
                    result = result + counter + symbol;
                } else {
                    result = result + symbol;
                }
            counter = 1;
            }
        }
        if (counter != 1) {
            result = result + counter;
        }
        return result;
    }
}
