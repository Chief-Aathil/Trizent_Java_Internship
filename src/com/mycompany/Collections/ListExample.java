package com.mycompany.Collections;

import java.util.*;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cat");
        list1.add("door");

        //Using aggregate operations to create list
        List<String> list2 = list1.stream()
                .map(s -> "a " + s)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("list1:" + list1);
        System.out.println("list2:" + list2);
        System.out.println(list1 instanceof ArrayList);
        System.out.println(list2 instanceof LinkedList);

        List<String> list3 = list1.stream()
                .map(s -> "its a " + s)
                .collect(Collectors.toCollection(LinkedList::new));
        Iterator<String> listIterator = list3.listIterator();
        System.out.println("list3:");
        while (listIterator.hasNext()) {
            System.out.print("\"" + listIterator.next() + "\"\t");
        }

        list1.add("elephant");
        list1.add("frog");
        System.out.println("list1.size:" + list1.size());
        List<String> view = list1.subList(1, 3);
        System.out.println("list1:" + list1 + "\nview:" + view);
        // view is backed by the list with which it was created.
        // so any change in the original list is reflected in the sublist(view)
        list1.set(1, "ball");
        System.out.println("list1:" + list1 + "\nview:" + view);
        list1.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println("list1:" + list1);
        list2.sort(Comparator.reverseOrder());
        System.out.println("list1:" + list2);

    }
}
