package ru.geekbrains.ads.lesson2.sort;

public class BubbleSort {
    public static void sort(Integer[] arr) {
        boolean isChange;
        do {
            isChange = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    Integer tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isChange = true;
                }
            }
        } while (isChange);
    }
}
