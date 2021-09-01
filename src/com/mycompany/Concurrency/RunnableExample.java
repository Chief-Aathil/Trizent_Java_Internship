package com.mycompany.Concurrency;


public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside thread!!");
        System.out.println("Thread:" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Thread:" + Thread.currentThread().getName());
        new Thread(new RunnableExample()).start();
    }
}
