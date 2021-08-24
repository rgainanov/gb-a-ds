package ru.geekbrains.ads.lesson3;

import java.util.Objects;

public class InterpolationSearch {
    public static int search(Integer[] arr, int num) {

        int start = 0;
        int end = arr.length - 1;
        int base;
        int i = 0;

        while (end >= start && num >= arr[start] && num <= arr[end]) {
            if (Objects.equals(arr[end], arr[start])) {
                break;
            }
            i++;
            base = (int) (start +
                    1.0 * (end - start) / (arr[end] - arr[start])
                            * (num - arr[start]));

            if (arr[base] == num) {
                System.out.println("количество итераций = " + i);
                return base;
            } else if (arr[base] > num) {
                end = base - 1;
            } else {
                start = base + 1;
            }
        }

        if (arr[start] == num) {
            System.out.println("количество итераций = " + i);
            return start;
        }

        return -1;
    }
}
