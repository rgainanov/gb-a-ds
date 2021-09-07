package ru.geekbrains.ads.lesson5.homework;

import java.util.ArrayList;
import java.util.List;

public class BagPackTask {
    private List<Item> bestItems;
    private int maxWeight;
    private int bestCost;

    public BagPackTask(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    private int calculateWeight(List<Item> items) {
        int sumWeight = 0;

        for(Item item: items) {
            sumWeight += item.getWeight();
        }

        return sumWeight;
    }

    private int calculateCost(List<Item> items) {
        int sumCost = 0;

        for(Item item: items) {
            sumCost += item.getCost();
        }

        return sumCost;
    }

    private void checkSet(List<Item> items) {
        if (bestItems == null) {
            if (calculateWeight(items) <= maxWeight) {
                bestItems = items;
                bestCost = calculateCost(items);
            }
        } else {
            if (calculateWeight(items) <= maxWeight && calculateCost(items) > bestCost) {
                bestItems = items;
                bestCost = calculateCost(items);
            }
        }
    }

    public void makeSets(List<Item> items) {
        if (items.size() > 0) {
            checkSet(items);
        }
        for (int i = 0; i < items.size() - 1; i++) {
            List<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            makeSets(newSet);
        }
    }

    public List<Item> getBestItems() {
        return bestItems;
    }
}
