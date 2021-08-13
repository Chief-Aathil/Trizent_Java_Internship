package com.mycompany.Interfaces;

interface DoIt {
    default void func() {
        System.out.println("Inside default func()");
    }
}

class DoItImplementation implements DoIt {
    @Override
    public void func() {
        System.out.println("Inside DoItImplementation.func()");
    }
}

class AnotherImplementation implements DoIt {

}

interface ExtendedDoIt extends DoIt {
    void func();
}

class MyClass3 implements ExtendedDoIt {
    /*
    Unlike `AnotherImplementation` this class have to either declare itself as abstract or define
    the func(), because `ExtendedDoIt` declares a default method( func() ) making it abstract in any
    class that implements `ExtendedDOIt`
     */
    public void func() {
        System.out.println("Inside MyClass3.func()");
    }
}

public class DefaultMethod {

    public static void main(String[] args) {
        DoIt obj = new DoItImplementation();
        obj.func();
        obj = new AnotherImplementation();
        obj.func();
    }
}
