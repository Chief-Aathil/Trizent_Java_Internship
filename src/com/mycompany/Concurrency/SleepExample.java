package com.mycompany.Concurrency;

public class SleepExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Time elapsed:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "sec");
            Thread.sleep(1000);
        }
        System.out.println("exiting...");
    }
}
