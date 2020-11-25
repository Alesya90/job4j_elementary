package ru.job4j.array;

public class SortSelected {
    /**
     *  min - минимальный элемента в массиве
     *  index - индекс элемента, полученного из метода MinDiapason.findMin.
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
