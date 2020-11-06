package ru.job4j.condition;

public class TestConversion {
    public static void main(String[] args) {
        // 5 выражение
        short s = 1500;
        char c = (char) s;
        double d = c;
        System.out.println(d);
    }
}
