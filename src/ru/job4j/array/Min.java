package ru.job4j.array;

public class Min {
    /**
     *  проверить, что эталон больше, чем элемент. записать в эталон элемент массива.
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
