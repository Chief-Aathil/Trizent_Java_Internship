package com.mycompany.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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

    }
}
