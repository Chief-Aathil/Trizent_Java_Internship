package com.mycompany.Concurrency;

import java.time.Duration;
import java.time.LocalTime;

class Threader implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Threader started. Name of thread: " + name + ". Entering sleep for 5sec...");
        System.out.println("Current time: " + LocalTime.now());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted..");
            System.out.println("Current time: " + LocalTime.now());

            throw new RuntimeException("Thread interrupted", e);
        }
    }


}

public class Interrupt {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Enter time after which thread will be interrupted:");
//        Scanner scanner= new Scanner(System.in);
//        int timeOfInterrupt=scanner.nextInt();
        Duration duration;
        LocalTime t1, t2;
        Threader threader = new Threader();
        System.out.println("Current time:" + LocalTime.now());
        System.out.println("Creating new thread...");

        Thread t = new Thread(threader);
        t.start();
        t1 = LocalTime.now();
        System.out.println("Current time:" + t1);
        System.out.println("Main Thread entering sleep..");
        Thread.sleep(3000); //wait for 3 sec before interrupting
        t.interrupt();
    }
}
