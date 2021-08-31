package ru.geekbrains.ads.lesson3.homework;

public class BinaryFind {
    public static int find(Integer[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int base;
        int iterations = 0;

        if (arr.length == 0) {
            return 1;
        }

        while (end >= start) {
            iterations++;
            base = (start + end) / 2;

            if (arr[base] == base + 1) {
                start = base + 1;
            } else if (arr[base] > base + 1) {
                if (arr[base] - arr[base - 1] != 1) {
                    System.out.println("Done in - " + iterations + " iterations");
                    return base + 1;
                }
                end = base - 1;
            }
        }
        return -1;
    }
}
