package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = -1;
        return rsl;
    }

    public static void main(String[] args) {
        int x1 = 0, y1 = 0, x2 = 2, y2 = 0;
        double distanse = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2-y1,2));
        System.out.println("distanse (0, 0) to (2, 0) = " + distanse);

    }
}