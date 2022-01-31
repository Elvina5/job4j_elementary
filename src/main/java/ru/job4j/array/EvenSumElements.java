package ru.job4j.array;

/**
 * Метод принимает массив целочисленных значений.
 * Метод должен определить сумму всех элементов в массиве, проверить значение суммы является ли оно четным числом.
 */

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        if (sum % 2 == 0) {
            return true;
        }

        return false;
    }
}
