package ru.geekbrains.ads.lesson2.homework;

public class BubbleSort {
    public static void sort(Notebook[] arr) {
        boolean isChange;
        do {
            isChange = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].getPrice() > arr[i + 1].getPrice()) {
                    Notebook tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isChange = true;
                } else if (
                        arr[i].getPrice() == arr[i + 1].getPrice() &&
                        arr[i].getMemory() > arr[i + 1].getMemory()
                ) {
                    Notebook tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isChange = true;
                } else if (
                        arr[i].getPrice() == arr[i + 1].getPrice() &&
                        arr[i].getMemory() == arr[i + 1].getMemory() &&
                        arr[i].getBrandRank() > arr[i + 1].getBrandRank()
                ) {
                    Notebook tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    isChange = true;
                }
            }
        } while (isChange);
    }
}