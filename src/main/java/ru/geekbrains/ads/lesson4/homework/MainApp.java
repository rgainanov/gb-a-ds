package ru.geekbrains.ads.lesson4.homework;

import ru.geekbrains.ads.lesson3.homework.Deque;

public class MainApp {
    public static void main(String[] args) {
        Deque<Integer> deque = new TwoSidedLinkedDequeImpl<>();

        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertRight(4);
        deque.insertRight(5);
        deque.insertRight(6);
        System.out.println("size: " + deque.size());
        deque.display();
//
//        System.out.println("first element: " + deque.peekFront());
//
//        deque.removeLeft();
//        deque.display();
//
//        deque.removeRight();
//        deque.display();

//        System.out.println("n0 element: " + deque.getNelement(5));

        System.out.println("Iterator test: ");
        for (Integer i: deque) {
            System.out.println(i);

        }
    }
}
