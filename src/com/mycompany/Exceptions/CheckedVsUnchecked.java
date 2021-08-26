package com.mycompany.Exceptions;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CheckedVsUnchecked {

    public static void write() {
//        PrintWriter out = new PrintWriter(new FileWriter("ABC.xyz"));
        // Here the FileWriter() constructor will throw IOException if "ABC.xyz" is not found
        // Since this is a checked exception it must satisfy the 'Catch or Specify Requirement'.
        // The code will not compile if the requirement is not satisfied.

        List<String> myList = new ArrayList<>(Arrays.asList("str1", "str2"));
        System.out.println(myList.get(10));
        // Here trying to get element out of the boundary will throw IndexOutOfBoundsException.
        // But, it is an unchecked exception. Hence, the code will compile.
    }

    public static void main(String[] args) {

    }
}
