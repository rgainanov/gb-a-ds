package ru.geekbrains.ads.lesson8.homework;

import ru.geekbrains.ads.lesson8.Product;

public class MainApp {
    public static void main(String[] args) {
        HashTableChainMethodImpl<Product, Integer> hashTable = new HashTableChainMethodImpl<>(5);

        hashTable.put(new Product(1, "Orange"), 150);
        hashTable.put(new Product(77, "Banana"), 1200);
        hashTable.put(new Product(67, "Carrot"), 112);
        hashTable.put(new Product(60, "Lemon"), 230);
        hashTable.put(new Product(51, "Milk"), 500);
        hashTable.put(new Product(21, "Potato"), 1121);

        hashTable.display();

        System.out.println(hashTable.get(new Product(21, "Potato")));

        System.out.println(hashTable.remove(new Product(21, "Potato")));
        System.out.println(hashTable.remove(new Product(51, "Milk")));

        hashTable.display();
    }
}
