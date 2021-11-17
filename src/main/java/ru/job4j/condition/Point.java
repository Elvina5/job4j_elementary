package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = -1;
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        int x2Minusx1 = x2 - x1;
        int y2Minusy1 = y2 - y1;
        double first = Math.pow(x2Minusx1, 2);
        double second = Math.pow(y2Minusy1, 2);
        double third = first + second;
        double fourth = Math.sqrt(third);
        System.out.println("result (0, 0) to (2, 0) " + fourth);

    }
}