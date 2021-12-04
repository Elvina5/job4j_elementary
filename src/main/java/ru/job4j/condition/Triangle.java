package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab < (bc + ac) && bc < (ab + ac) && ac < (ab + bc);
    }
}