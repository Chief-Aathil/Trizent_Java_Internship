package com.mycompany.Concurrency;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class MyRunner implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside MyRunner...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("MyRunner interrupted");
        } finally {
            System.out.println("MyRunner finished...");
        }
    }
}

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting new thread...");
        Thread thread = new Thread(new MyRunner());
        thread.start();
        thread.join(); //waits for the thread to finish
        System.out.println("Join complete");
    }

}
