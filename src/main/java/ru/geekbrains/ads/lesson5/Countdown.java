package ru.geekbrains.ads.lesson5;

public class Countdown {
    public static void main(String[] args) {
        countDown(5);
    }

    private static void countDown(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        countDown(--n);
    }
}
