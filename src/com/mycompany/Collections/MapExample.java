package com.mycompany.Collections;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();  //No definite order
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //input order

        String[] strArr = {"apple", "ball", "cat", "door", "fan", "goat"};
        Integer[] intArr = {2, 34, 1, 100, 7, 3};
        for (int i = 0; i <= 5; i++) {
            hashMap.put(intArr[i], strArr[i]);
            linkedHashMap.put(intArr[i], strArr[i]);
        }
        System.out.println("hashMap:" + hashMap);
        Map<Integer, String> treeMap = new TreeMap<>(hashMap);  //ascending key order
        System.out.println("treeMap:" + treeMap);
        System.out.println("linkedHashMap:" + linkedHashMap);

    }
}
