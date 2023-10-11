package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean canDivByNum = false;
        for (int i = 2; i < number + 1; i++) {
            if (number % i == 0 && number != i) {
                break;
            }
            canDivByNum = true;
        }
        return canDivByNum;
    }
}
