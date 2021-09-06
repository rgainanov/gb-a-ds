package ru.geekbrains.ads.lesson5;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] arr = {2, 5, 4, 3, 6, 9, 8, 4, 5, 3, 1, 2, 7, 8, 9, 5, 4, 3, 6, 78, 8, 9, 6, 4, 3, 2};

        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(BinarySearchRecursion.searchRec(arr, 6));
    }
}
