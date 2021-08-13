package com.mycompany.Classes;

class MethodTest {

    //TODO: Implement Method Reference Example
    public static void staticFunction() {
        System.out.println("Inside MethodTest::staticFunction");
    }


    public void function() {
        System.out.println("Inside function()");
    }

    public MethodTest() {
        System.out.println("Insider MethodTest Constructor");
    }
}

public class MethodReferences {
    MethodTest obj = new MethodTest();

}
