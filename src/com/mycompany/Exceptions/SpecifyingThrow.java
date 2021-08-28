package com.mycompany.Exceptions;

import java.io.IOException;

public class SpecifyingThrow {
    public static void myFunction() throws ArithmeticException, NullPointerException {
//        int x= 10/0; //uncomment to throw ArithmeticException
        int[] a;
        a = null;
        System.out.println(a[0]);

    }

    public static void main(String[] args) {
        try {
            myFunction();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
