package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                rsl[i + j] = left[i];
                i++;
            } else {
                rsl[i + j] = right[j];
                j++;
            }
        }
        while (i < left.length) {
            rsl[i + j] = left[i];
            i++;
        }
        while (j < right.length) {
            rsl[i + j] = right[j];
            j++;
        }
        return rsl;
    }
}