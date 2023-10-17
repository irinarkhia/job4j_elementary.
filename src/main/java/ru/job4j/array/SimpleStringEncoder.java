//package ru.job4j.array;
//
//public class SimpleStringEncoder {
//    public static String encode(String input) {
//        String result = "";
//        int counter = 1;
//        for (int i = 0; i < input.length() + 1; i++) {
//            char symbol = input.charAt(0);
//            if (input.charAt(i) == input.charAt(i + 1)) {
//                counter++;
//                result = result + (input.charAt(i + 1) + counter);
//            }
//        }
//        return result;
//    }
//}
