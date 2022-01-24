package ru.job4j.condition;

/**
 * 1. Если совпадает первый символ у двух клеток - значит ладьи стоят на одной линии - метод должен вернуть true (первый символ - это буква столбца, где стоит фигура);
 * 2. Если совпадает второй символ у двух клеток - значит ладьи стоят на одной линии - метод должен вернуть true (второй символ - это цифра строки, где стоит фигура);
 * Во всех остальных случаях метод должен вернуть false.
 */
public class AttackRook {
    public static boolean check(String left, String right) {
        if (left.charAt(0) == right.charAt(0)) {
            return true;
        }
        if (left.charAt(1) == right.charAt(1)) {
            return true;
        }
        return false;
    }
}