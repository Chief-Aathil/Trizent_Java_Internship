package com.mycompany.Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Properties {

    public static void testSharing() {
        List<String> strList = new ArrayList<String>();
        List<Integer> intList = new ArrayList<Integer>();
        System.out.println(strList.getClass() == intList.getClass());
        //All instances of a generic class have the same run-time class.
    }

    public static void testInstanceOf() {
        Collection cs = new ArrayList<String>();
//        System.out.println(cs instanceof Collection<String>);
//    Illegal

        Collection<String> cstr = (Collection<String>) cs;
        //Unchecked cast
    }

    public static <T> T testCast(T t, Object o) {
        return (T) o;
        //unchecked cast
    }


    public static void main(String[] args) {
        testSharing();
        System.out.println(testCast("str", 123)); // gives ClassCastException
    }
}
