package com.mycompany.Classes;

interface MyInterface {
    void function();
}

// Note that for an interface with only one abstract method, lambda expression is more
//concise than Anonymous class.
public class AnonymousClassExample {
    public void func() {
        MyInterface interfaceObj = new MyInterface() {
            public void function() {
                System.out.println("Interface implemented using Anonymous class");
            }

        };
        MyInterface myInterfaceObj2 = new MyInterface() {
            public void function() {
                System.out.println("Interface implemented using Anonymous class2");
            }

        };
        interfaceObj.function();
        myInterfaceObj2.function();

    }

    public static void main(String[] args) {
        AnonymousClassExample obj = new AnonymousClassExample();
        obj.func();
    }
}
