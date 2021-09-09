package ru.geekbrains.ads.lesson6;

public interface Tree<E extends Comparable<? super E>> {

    boolean add(E value);

    Node<E> getRoot();

    boolean contains(E value);

    boolean remove(E value);

    boolean isEmpty();

    int size();

    void display();

    void traverse(TraverseMode mode);

    boolean isBalanced(Node<E> node);

    enum TraverseMode {IN_ORDER, PRE_ORDER, POST_ORDER}
}
