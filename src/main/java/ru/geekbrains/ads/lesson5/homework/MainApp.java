package ru.geekbrains.ads.lesson5.homework;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
//        System.out.println(pow(2, 8));

        List<Item> items = new ArrayList<>();
        items.add(new Item("Laptop", 2, 100));
        items.add(new Item("Guitar", 5, 200));
        items.add(new Item("Dumbbell", 10, 4));
        items.add(new Item("Smartphone", 1, 10));
//        items.add(new Item("Smartphone2", 9, 1000));


        BagPackTask bp = new BagPackTask(10);
        bp.makeSets(items);

        List<Item> solve = bp.getBestItems();

        if (solve == null) {
            System.out.println("Solve not found");
        } else {
            for (int i = 0; i < solve.size(); i++) {
                System.out.print(solve.get(i).getName());
                if (i != solve.size()-1) {
                    System.out.print(" - ");
                }
            }
        }

    }

    public static int pow(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        if (pow == 1) {
            return num;
        }
        return num * pow(num, --pow);
    }
}
