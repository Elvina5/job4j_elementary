package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int in = 2; in < (number - 1); in++) {
            if (number % in == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}