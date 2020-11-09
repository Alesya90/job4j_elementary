package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = 0;
        if (first > second) {
            result = (first > third) ? first : third;
        } else {
            result = (second > third) ? second : third;
        }
        return result;
        // либо так return (first > second) ? Math.max(first, third) : Math.max(second, third);
    }
}
