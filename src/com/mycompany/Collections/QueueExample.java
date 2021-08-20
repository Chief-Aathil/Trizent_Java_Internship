package com.mycompany.Collections;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList("one", "two", "three", "four"));
        Queue<String> queue = new LinkedList<>(set1);
        queue.add("zero");
        System.out.println("queue:" + queue);
        System.out.println("queue.element():" + queue.element());
        while (!queue.isEmpty()) {
            System.out.println("queue.remove():" + queue.remove() + "\t queue:" + queue);

        }
        Queue<String> priorityQ = new PriorityQueue<>(set1); // elements are ordered based on value.
        System.out.println("priorityQ:" + priorityQ);
        priorityQ.add("five");
        System.out.println("priorityQ:" + priorityQ);
        priorityQ.offer("eight");
        System.out.println("priorityQ:" + priorityQ);
        priorityQ.add("six");
        System.out.println("priorityQ:" + priorityQ);

    }
}
