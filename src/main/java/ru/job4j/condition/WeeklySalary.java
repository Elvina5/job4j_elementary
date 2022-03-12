package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int rsl = 0;
        for (int i = 0; i < hours.length; i++) {
           if ((i < 5) && (hours[i] < 9)) {
               rsl += hours[i] * 10;
            } else if ((i < 5) && (hours[i] > 8)) {
               rsl += 80 + (hours[i] - 8) * 15;
           } else if ((i > 4 && i < 7) && (hours[i] < 9)) {
               rsl += hours[i] * 20;
           } else if ((i > 4 && i < 7) && (hours[i] > 8)) {
                rsl += 160 + (hours[i] - 8) * 30;
            }

        }
        return rsl;
    }
}
