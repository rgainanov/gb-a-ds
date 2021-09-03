package ru.geekbrains.ads.lesson4.homework;

import ru.geekbrains.ads.lesson3.homework.Deque;
import ru.geekbrains.ads.lesson4.TwoSideLinkedList;
import ru.geekbrains.ads.lesson4.TwoSideLinkedListImpl;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TwoSidedLinkedDequeImpl<E> implements Deque<E> {

    private TwoSideLinkedList<E> data;

    public TwoSidedLinkedDequeImpl() {
        this.data = new TwoSideLinkedListImpl<>();
    }

    @Override
    public boolean insertLeft(E value) {
        data.insertFirst(value);
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E removeLeft() {
        return data.removeFirst();
    }

    @Override
    public E removeRight() {
        return data.removeLast();
    }

    @Override
    public boolean insert(E value) {
        data.insertFirst(value);
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private E[] iterableArray = data.getEarray();
            private int i = 0;

            @Override
            public boolean hasNext() {
                return (data.size() > i && iterableArray[i] != null);
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return iterableArray[i++];
            }
        };
    }

    @Override
    public E remove() {
        return data.removeLast();
    }

    @Override
    public E peekFront() {
        return data.getFirst();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void display() {
        data.display();
    }

    @Override
    public String toString() {
        return "TwoSidedLinkedDequeImpl{" +
                "data=" + data +
                '}';
    }


}
