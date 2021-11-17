package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;

    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.14F;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.88F;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        euro = Converter.dollarToEuro(300);
        System.out.println("300 dollars are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(250);
        System.out.println("250 rubles are " + dollar + " dollars.");
        dollar = Converter.euroToDollar(150);
        System.out.println("150 euro are " + dollar + " dollars");

    }
}