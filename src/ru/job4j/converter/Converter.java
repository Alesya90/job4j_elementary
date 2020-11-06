package ru.job4j.converter;

public class Converter {
    public static double rubleToEuro(double value) {
        double rsl = value / 70;
        return rsl;
    }

    public static double rubleToDollar(double value) {
        double rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        int in = 140;
        double expected = 2;
        double out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        expected = 2.3333333333333335;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2.3333333333333335 dollar. Test result : " + passed);
    }
}
