package ru.geekbrains.ads.lesson3.queue;

public class QueueImpl<E> implements Queue<E> {

    protected final int TAIL_DEFAULT = -1;
    protected final int HEAD_DEFAULT = 0;
    protected final E[] data;
    protected int size;

    protected int tail;
    protected int head;

    public QueueImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        head = HEAD_DEFAULT;
        tail = TAIL_DEFAULT;
    }

    @Override
    public boolean insert(E value) {
        if (isFull()) {
            return false;
        }
        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            return null;
        }
        E value = data[head++];
        size--;
        if (size == 0) {
            tail = TAIL_DEFAULT;
            head = HEAD_DEFAULT;
        }
        return value;
    }

    @Override
    public E peakFront() {
        return data[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = head; i <= tail; i++) {
            sb.append(data[i]);
            if (i != tail) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
