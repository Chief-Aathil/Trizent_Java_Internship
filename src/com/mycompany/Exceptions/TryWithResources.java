package com.mycompany.Exceptions;

import java.io.*;

public class TryWithResources {
    public static void tryWithTest() throws IOException {
        PrintWriter output = new PrintWriter(new FileWriter("out\\TestSuppressedException"));
        try (PrintWriter out = new PrintWriter(new FileWriter("out\\TestSuppressedException"))) {
            System.out.println("Inside try block");
            IOException t = new IOException();
            t.addSuppressed(new EOFException());
            throw t;
        }
    }

    public static void main(String[] args) {

        try {
            tryWithTest();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("Suppressed exceptions:");
            if (e.getSuppressed() == null) {
                System.out.println("no suppressed exceptions");
            } else {
                for (Throwable t : e.getSuppressed()) {
                    t.printStackTrace();
                }
            }

        }
    }
}

