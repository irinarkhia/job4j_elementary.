package ru.job4j.math;

public class MathFunction {
    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double minus(double first, double second) {
        return first - second;
    }

    public static double del(double first, double second) {
        return first / second;
    }

    public static double sumAndMultiply(double first, double second) {
        double summ1 = sum(sum(first, second), multiply(first, second));
        return sum(sum(first, second), multiply(first, second));
    }

    public static double doubleOperations(double first, double second) {
        return sum(minus(first, second), del(first, second));
    }

    public static double fourOperations(double first, double second) {
        return sum(sum(minus(first, second), del(first, second)), sum(multiply(first, second), minus(first, second)));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + fourOperations(10, 20));
    }
}
