package ru.job4j.condition;

public class Game2 {
    public static int checkGame(double percent, int prize, int pay) {
        if (percent * prize > pay) {
            return (int) (percent * prize) - pay;
        } else  {
            return 0;
        }
    }
}
