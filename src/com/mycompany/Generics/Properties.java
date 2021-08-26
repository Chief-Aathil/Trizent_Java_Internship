package com.mycompany.Generics;

import java.util.ArrayList;
import java.util.List;

public class Properties {

    public static void testSharing() {
        List<String> strList = new ArrayList<String>();
        List<Integer> intList = new ArrayList<Integer>();
        System.out.println(strList.getClass() == intList.getClass());
        
    }

    public static void main(String[] args) {
        testSharing();
    }
}
