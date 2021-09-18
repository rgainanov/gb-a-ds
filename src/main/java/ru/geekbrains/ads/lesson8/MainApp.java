package ru.geekbrains.ads.lesson8;

public class MainApp {
    public static void main(String[] args) {
//        HashTable<Product, Integer> hashTable = new HashTableImpl<>(5);
        HashTable<Product, Integer> hashTable = new DoubleHashTable<>(5);

        hashTable.put(new Product(1, "Orange"), 150);
        hashTable.put(new Product(77, "Banana"), 1200);
        hashTable.put(new Product(67, "Carrot"), 112);
        hashTable.put(new Product(60, "Lemon"), 230);
        hashTable.put(new Product(51, "Milk"), 500);
        hashTable.put(new Product(21, "Potato"), 1121);

        hashTable.display();

        System.out.println(hashTable.get(new Product(77, "Banana")));

        hashTable.remove(new Product(21, "Potato"));
        hashTable.remove(new Product(77, "Banana"));

        System.out.println(hashTable.get(new Product(77, "Banana")));

        hashTable.put(new Product(47, "Pineapple"), 300);

        hashTable.display();

    }
}
