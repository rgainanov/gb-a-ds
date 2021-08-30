package ru.geekbrains.ads.lesson3.homework;

import ru.geekbrains.ads.lesson3.queue.Queue;

public interface Deque<E> extends Queue<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();
}
