package ru.job4j.array;

public class Turn {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static int[] back(int[] array) {
        for (int index = 0; index < (array.length * 0.5); index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}
