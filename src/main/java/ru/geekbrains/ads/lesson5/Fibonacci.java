package ru.geekbrains.ads.lesson5;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
