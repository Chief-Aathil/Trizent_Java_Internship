package com.mycompany.Concurrency;

class AnotherRunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("\nInside thread!\nUsing:" + this.getClass().toString());
        System.out.println("Thread name:" + Thread.currentThread().getName());
    }
}

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("\nInside thread!\nUsing:" + this.getClass().toString());
        System.out.println("Thread name:" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Thread:" + Thread.currentThread().getName());
        new Thread(new RunnableExample()).start();
        AnotherRunnableExample obj = new AnotherRunnableExample();
        Thread thread = new Thread(obj);
        thread.start();
    }
}
