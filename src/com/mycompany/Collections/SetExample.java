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
        System.out.println("mySet1.add(1): " + mySet1.add(1)); //attempting to add duplicate element
        mySet1.remove(5);


        Set<Integer> mySet4 = new LinkedHashSet<>(Arrays.asList(100, 200, 300));
        Set<Integer> union = new HashSet<>(mySet2);
        System.out.println("\nmySet4: " + mySet4);
        System.out.println("union:" + union);
        union.addAll(mySet4);
        System.out.println("union after addAll():" + union);
        union = new TreeSet<>(union);
        System.out.println("union(TreeSet):" + union);

        Set<Integer> intersection = new TreeSet<>(mySet1);
        System.out.println("intersection: " + intersection);
        intersection.retainAll(Arrays.asList(1, 2, 3));
        System.out.println("intersection after retainAll(): " + intersection);

        Set<Integer> diff = new TreeSet<>(mySet2);
        System.out.println("diff:" + diff);
        diff.removeAll(intersection);
        System.out.println("diff after removeAll(): " + diff);

    }
}
