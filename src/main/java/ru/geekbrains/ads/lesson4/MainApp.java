package ru.geekbrains.ads.lesson4;

import ru.geekbrains.ads.lesson3.queue.Queue;
import ru.geekbrains.ads.lesson3.stack.Stack;

public class MainApp {


    public static void main(String[] args) {
//        linkedListTest();
//        linkedListStackTest();
//        twoSidedLinkedListTest();
//        linkedQueueTest();
    }

    public static void linkedQueueTest() {
        Queue<Integer> queue = new LinkedQueueImpl<>();

        queue.insert(10);
        queue.insert(11);
        queue.insert(12);
        queue.insert(13);

        System.out.println("first element: " + queue.peekFront());
        queue.display();

        queue.remove();
        queue.display();


    }

    public static void twoSidedLinkedListTest() {
        TwoSideLinkedList<Integer> twoSideLinkedList = new TwoSideLinkedListImpl<>();

        twoSideLinkedList.insertFirst(1);
        twoSideLinkedList.insertFirst(2);
        twoSideLinkedList.insertFirst(3);
        twoSideLinkedList.insertFirst(4);
        twoSideLinkedList.insertFirst(5);
        twoSideLinkedList.insertLast(6);
        twoSideLinkedList.insertLast(7);
        twoSideLinkedList.insertLast(8);
        twoSideLinkedList.insertLast(9);
        twoSideLinkedList.insertLast(10);

        twoSideLinkedList.display();

        twoSideLinkedList.removeFirst();
        twoSideLinkedList.display();

        twoSideLinkedList.remove(1);
        twoSideLinkedList.remove(10);
        twoSideLinkedList.display();
    }

    public static void linkedListStackTest() {
        Stack<Integer> stack = new LinkedListStack<>();

        addToStack(stack, 1);
        addToStack(stack, 2);
        addToStack(stack, 3);
        addToStack(stack, 4);

        stack.display();

        deleteFromStack(stack);

        stack.display();

        System.out.println("top value: " + stack.peek());

    }

    private static boolean addToStack(Stack<Integer> stack, int value) {
        if (!stack.isFull()) {
            stack.push(value);
            return true;
        }
        return false;
    }

    private static int deleteFromStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int value = stack.pop();
            return value;
        }
        return -1;
    }

    public static void linkedListTest() {
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);

        linkedList.display();

        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 4: " + linkedList.contains(4));

        linkedList.removeFirst();
        linkedList.display();

        linkedList.remove(1);
        linkedList.display();
    }
}
