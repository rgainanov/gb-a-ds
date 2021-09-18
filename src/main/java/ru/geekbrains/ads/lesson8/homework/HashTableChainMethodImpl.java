package ru.geekbrains.ads.lesson8.homework;

import ru.geekbrains.ads.lesson8.HashTable;

import java.util.LinkedList;

public class HashTableChainMethodImpl<K, V> implements HashTable<K, V>{
    protected LinkedList<Item<K, V>>[] data;
    protected int size;

    public HashTableChainMethodImpl(int initialCapacity) {
        this.data = new LinkedList[initialCapacity];
        for (int i = 0; i < data.length; i++) {
            data[i] = new LinkedList<>();

        }
    }

    @Override
    public boolean isEmpty() {
        return size != 0;
    }

    protected int hasFunc(K key) {
        return key.hashCode() % data.length;
    }

    @Override
    public V remove(K key) {
        int index = hasFunc(key);
        for (int i = 0; i < data[index].size(); i++) {
            if (data[index].get(i).getKey().equals(key)) {
                Item<K, V> tempItem = data[index].get(i);
                data[index].remove(data[index].get(i));
                size--;
                return tempItem.getValue();
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public V get(K key) {
        int index = hasFunc(key);
        for (Item<K, V> item : data[index]) {
            if (item.getKey().equals(key)) {
                return item.getValue();
            }
        }
        return null;
    }

    @Override
    public boolean put(K key, V value) {
        int index = hasFunc(key);

        for (Item<K, V> item : data[index]) {
            if (item.getKey().equals(key)) {
                item.setValue(value);
                return true;
            }
        }
        data[index].addLast(new Item<>(key, value));
        size++;
        return true;
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------\n");
        for (int i = 0; i < data.length; i++) {
            sb.append(i).append(": [");
            for (int j = 0; j < data[i].size(); j++) {
                sb.append(data[i].get(j));
                if (j != data[i].size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]\n");
        }
        sb.append("----------------------");
        System.out.println(sb);
    }

    protected static class Item<K, V> implements HashTable.Entry<K, V> {

        private final K key;
        private V value;

        public Item(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}
