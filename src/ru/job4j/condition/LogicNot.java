package ru.job4j.condition;

public class LogicNot {
    public boolean isEven(int num) { //число четное
        return num % 2 == 0;
    }

    public boolean isPositive(int num) { //число положительное
        return num > 0;
    }

    public boolean notEven(int num) { //число нечетное
        return !isEven(num);
    }

    public boolean notPositive(int num) { //число не положительное
        return !isPositive(num);
    }

    public boolean notEvenAndPositive(int num) { //число нечетное и положительное
        return notEven(num) && isPositive(num);
    }

    public boolean evenOrNotPositive(int num) { //число четное или не положительное
        return isEven(num) || notPositive(num);
    }

}

