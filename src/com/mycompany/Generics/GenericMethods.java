package com.mycompany.Generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static sun.misc.Version.print;

public class GenericMethods {
    public static <T> void printCollection(Collection<T> c) {
        for (T item : c) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3));
        GenericMethods.printCollection(collection);
    }

}
