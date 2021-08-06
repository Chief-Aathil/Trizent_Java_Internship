package com.mycompany.Classes;

class MyClass {
    String name;

    public MyClass() {
        //This will give error as invocation of another constructor, if present,
        // should be the first line in the constructor.
//        System.out.println("Inside default constructor");
        this("abc");//explicit constructor invocation
    }

    public MyClass(String x) {
        this.name = x;
    }
}

public class MultipleConstructors {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        System.out.println(obj.name);

    }
}
