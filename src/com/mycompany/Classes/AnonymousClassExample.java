package com.mycompany.Classes;

import java.io.PrintStream;

interface MyInterface {
    void function();
}

// Note that for  implementing an interface with only one abstract method(functional interface),
// lambda expression is more concise than Anonymous class.
public class AnonymousClassExample {
    private MyInterface interfaceObj;

    public void func() {
        MyInterface interfaceObj = new MyInterface() {
            String Str = "test";

            public void function() {
                System.out.println("Interface implemented using Anonymous class");
                System.out.println("anonymousStr: " + Str);

            }

        };
//        System.out.println(interfaceObj.Str);
        // since interfaceObj is of type MyInterface it can't access the
        // Str field of the Anonymous class. In fact all the members other than those defined in the Interface is
        // inaccessible outside the Anonymous class.
        System.out.println(interfaceObj);
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
