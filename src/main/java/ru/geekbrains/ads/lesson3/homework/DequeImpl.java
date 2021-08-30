package ru.geekbrains.ads.lesson3.homework;

import ru.geekbrains.ads.lesson3.queue.QueueImpl;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E> {

    public int getTail() {
        return tail;
    }

    public int getHead() {
        return head;
    }

    public DequeImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }

        int index;
        for (index = size; index > 0; index--) {
            data[index] = data[index - 1];
        }
        data[0] = value;
        size++;
        tail++;
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        return insert(value);
    }

    @Override
    public E removeLeft() {
        return remove();
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }
        E value = data[tail--];
        size--;
        if (size == 0) {
            tail = TAIL_DEFAULT;
            head = HEAD_DEFAULT;
        }
        return value;
    }
}
