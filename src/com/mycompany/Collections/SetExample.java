package com.mycompany.Collections;

import java.util.*;
import java.util.stream.Collectors;

public class SetExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Set<Integer> mySet1 = new HashSet<>(Arrays.asList(arr));
        mySet1.add(0);
        System.out.println("mySet1:");
        for (Integer i : mySet1) {
            System.out.print(i + " ");
        }
    }
}
