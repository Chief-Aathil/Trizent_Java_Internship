package com.mycompany.Collections;

import java.util.*;
import java.util.stream.Collectors;

public class SetExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = {1, 3, 10, 9, 2, 8, 5, 4, 6, 7};

        Set<Integer> mySet1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> mySet2 = new TreeSet<>(mySet1);
        Set<Integer> mySet3 = mySet1.stream().collect(Collectors.toSet()); // using stream
        mySet1.add(0);
        System.out.println("mySet1(HashSet):");
        for (Integer i : mySet1) {
            System.out.print(i + " ");
        }
        System.out.println("\nmySet2(TreeSet):");
        for (Integer i : mySet2) {
            System.out.print(i + " ");
        }
        System.out.println("\nmySet3(LinkedHashSet):");
        for (Integer i : mySet3) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + (mySet3 instanceof HashSet));
    }
}
