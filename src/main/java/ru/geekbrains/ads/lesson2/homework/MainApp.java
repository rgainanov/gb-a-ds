package ru.geekbrains.ads.lesson2.homework;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        Random rand = new Random();
        int notebookQuantity = 5000;
        Notebook[] notebooks = new Notebook[notebookQuantity];

        List<Integer> availableMemory = Arrays.asList(4, 8, 16, 32);
        List<Integer> availableStorage = Arrays.asList(256, 512, 1024, 2048);

        List<Map<Integer, String>> availableBrandsT = new ArrayList<>();
        availableBrandsT.add(new HashMap<Integer, String>() {{
            put(1, "Xamiou");
        }});
        availableBrandsT.add(new HashMap<Integer, String>() {{
            put(2, "Eser");
        }});
        availableBrandsT.add(new HashMap<Integer, String>() {{
            put(3, "MacNote");
        }});
        availableBrandsT.add(new HashMap<Integer, String>() {{
            put(4, "Asos");
        }});
        availableBrandsT.add(new HashMap<Integer, String>() {{
            put(5, "Lenuvo");
        }});

        for (int i = 0; i < notebooks.length; i++) {
            int price = (rand.nextInt(6) + 5) * 100;
            int memory = availableMemory.get(rand.nextInt(availableMemory.size()));
            Map<Integer, String> brand = availableBrandsT.get(rand.nextInt(availableBrandsT.size()));
            int storage = availableStorage.get(rand.nextInt(availableStorage.size()));
            int serialNumber = i * 1000;

            notebooks[i] = new Notebook(price, memory, storage, brand, serialNumber);
        }

        BubbleSort.sort(notebooks);

        for (int i = 0; i < notebooks.length; i++) {
            System.out.println(
                    "serial number: " + notebooks[i].getSerialNumber() +
                    ", price: " + notebooks[i].getPrice() +
                    ", memory: " + notebooks[i].getMemory() +
                    ", brand: " + notebooks[i].getBrand()
            );
        }
    }
}
