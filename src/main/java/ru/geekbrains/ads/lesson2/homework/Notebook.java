package ru.geekbrains.ads.lesson2.homework;

import java.util.Map;

public class Notebook {
    private int price;
    private int memory;
    private int storage;
    private Map<Integer, String> brand;
    private int serialNumber;

    public Notebook(int price, int memory, int storage, Map<Integer, String> brand, int serialNumber) {
        this.price = price;
        this.memory = memory;
        this.storage = storage;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getMemory() {
        return memory;
    }

    public int getStorage() {
        return storage;
    }

    public String getBrand() {
        return (String) brand.values().toArray()[0];
    }

    public int getBrandRank() {
        return (int) brand.keySet().toArray()[0];
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", memory=" + memory +
                ", storage=" + storage +
                ", brand='" + brand + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
