package ru.geekbrains.ads.lesson3.homework;

import ru.geekbrains.ads.lesson3.queue.Queue;

import java.util.Iterator;

public interface Deque<E> extends Queue<E>, Iterable<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();

    Iterator<E> iterator();
}
