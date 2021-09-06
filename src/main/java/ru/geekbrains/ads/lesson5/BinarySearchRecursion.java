package ru.geekbrains.ads.lesson5;

public class BinarySearchRecursion {
    public static int searchRec(Integer[] arr, int num) {
        return searchRec(arr, num, 0, arr.length);
    }

    private static int searchRec(Integer[] arr, Integer num, int left, int right) {
        if (right < left) {
            return -1;
        }

        int base = (left + right) / 2;
        if (arr[base].equals(num)) {
            return base;
        } else if (num.compareTo(arr[base]) > 0) {
            return searchRec(arr, num, base + 1, right);
        } else {
            return searchRec(arr, num, left, base - 1);
        }
    }
}
