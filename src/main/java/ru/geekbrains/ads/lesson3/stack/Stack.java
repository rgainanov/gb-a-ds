package ru.geekbrains.ads.lesson3.stack;

public interface Stack<E> {
    void push(E value);

    E pop();

    E peak();

    int size();

    boolean isEmpty();

    boolean isFull();

    void display();
}
