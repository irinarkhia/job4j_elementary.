package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean canDivByNum = false;
        if (number == 2) {
            canDivByNum = true;
        } else {
            for (int i = 2; i < number; i++) {
                if (number %  i != 0) {
                    canDivByNum = true;
                } else {
                    canDivByNum = false;
                    break;
                }
            }
        }
        return canDivByNum;
    }
}
