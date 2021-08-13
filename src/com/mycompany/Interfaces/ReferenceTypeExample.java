package com.mycompany.Interfaces;

interface MyInterface {
    public void func();
}

class MyClass1 implements MyInterface {
    @Override
    public void func() {
        System.out.println("Inside MyClass1.func()");
    }
}

class MyClass2 implements MyInterface {
    @Override
    public void func() {
        System.out.println("Inside MyClass2.func()");
    }
}

public class ReferenceTypeExample {

    public static void main(String[] args) {
        MyInterface obj = new MyClass1(); //Reference variables of interface-type should be assigned an object which
        // is an instance of a class that implements that interface.
        obj.func();
        obj = new MyClass2();
        obj.func();
    }

}
