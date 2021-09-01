package com.mycompany.Concurrency;

class MySubClass extends Thread {
    @Override
    public void run() {
        System.out.println("Inside: " + this.getClass());
        System.out.println("Thread name:" + Thread.currentThread().getName());
    }
}

public class SubclassThread extends Thread {
    @Override
    public void run() {
        System.out.println("Inside: " + getClass());
        System.out.println("Thread name:" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Inside: SubClassThread");
        System.out.println("Thread name:" + Thread.currentThread().getName());
        MySubClass obj1 = new MySubClass();
        obj1.start();
        SubclassThread obj2 = new SubclassThread();
        obj2.start();
    }
}
