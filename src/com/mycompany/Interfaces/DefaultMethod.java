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

public class DefaultMethod {

    public static void main(String[] args) {
        DoIt obj = new DoItImplementation();
        obj.func();
        obj = new AnotherImplementation();
        obj.func();
    }
}
