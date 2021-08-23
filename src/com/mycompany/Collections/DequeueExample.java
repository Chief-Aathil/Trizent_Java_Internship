package com.mycompany.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("one");
        deque.offerFirst("two");
        System.out.println("deque:" + deque + "\tfirst:" + deque.getFirst());
        deque.addLast("three");
        deque.offerLast("four");
        System.out.println("deque:" + deque + "\tfirst:" + deque.peekFirst());
        deque.removeFirst();
        System.out.println("deque:" + deque + "\tlast:" + deque.getLast());
        deque.pollLast();
        System.out.println("deque:" + deque + "\tlast:" + deque.peekLast());
        deque.addFirst("five");
        deque.addFirst("six");
        deque.addFirst("five");
        deque.addLast("five");
        System.out.println("deque:" + deque);
        deque.removeFirstOccurrence("five");
        System.out.println("deque:" + deque);
        deque.removeLastOccurrence("five");
        System.out.println("deque:" + deque);


    }
}
