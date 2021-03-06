package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int sdacha = money - price;
        for (int i = 0; i < coins.length; i++) {
            while ((sdacha - coins[i]) >= 0) {
                sdacha = sdacha - coins[i];
                rsl[size] = coins[i];
                size = size + 1;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        System.out.println("Hello Alesia!");
    }
}
