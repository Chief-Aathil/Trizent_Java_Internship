package com.mycompany.Exceptions;

import java.io.IOException;

public class ChainedException {
    public static void thrower() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new IOException(e);
        } finally {
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) {

        try {
            thrower();
        } catch (Exception e) {
            e.printStackTrace();
            if (e.getSuppressed().length != 0) {
                System.out.println("Suppressed Exceptions:");
                for (Throwable t : e.getSuppressed()) {
                    t.printStackTrace();
                }
            }

        }
    }
}
