package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = (first > second) ? first : second;
        return (result > third) ? result : third;
        // либо так return (first > second) ? Math.max(first, third) : Math.max(second, third);
        //return Math.max(Math.max(first, second), third);
    }
}
