package ru.geekbrains.ads.lesson2;

import ru.geekbrains.ads.lesson2.sort.BubbleSort;
import ru.geekbrains.ads.lesson2.sort.InsertionSort;
import ru.geekbrains.ads.lesson2.sort.SelectionSort;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Integer[] arr = {9, 8, 5, 3, 45, 7, 9, 3, 1, 4, 6};

//        BubbleSort.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        SelectionSort.sort(arr);
//        System.out.println(Arrays.toString(arr));

        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));


    }

}
