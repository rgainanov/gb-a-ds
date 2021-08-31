package ru.geekbrains.ads.lesson3.homework;

public class MainApp {
    public static void main(String[] args) {
        binaryFindTest();

        System.out.println();
        System.out.println();

        DequeImpl<Integer> deque = new DequeImpl<>(5);
        deque.insertRight(5);
        deque.insertLeft(6);
        deque.insertRight(7);
        deque.insertLeft(8);
        deque.insertRight(9);
        deque.insertLeft(10);

        deque.display();

        deque.removeLeft();
        deque.removeRight();
        deque.removeLeft();
        deque.removeRight();
        deque.removeLeft();

        deque.display();

        deque.insertRight(1);
        deque.insertLeft(2);
        deque.insertRight(3);
        deque.insertLeft(4);
        deque.insertRight(5);
        deque.insertRight(6);

        deque.display();

    }

    public static void binaryFindTest() {
        final int ARR_LENGTH = 1000000;
        Integer[] arr = new Integer[ARR_LENGTH];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        arr[ARR_LENGTH - 1] = ARR_LENGTH + 1;

        int res = BinaryFind.find(arr);
        System.out.println(res);
    }


}
