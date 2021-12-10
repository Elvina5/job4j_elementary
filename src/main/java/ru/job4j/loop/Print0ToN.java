package ru.job4j.loop;

public class Print0ToN {
    public static void out(int n) {
        int out = 0;
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}