package com.mycompany.Exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TryWIthResources {
    public static void tryWithTest() throws IOException {
        try (PrintWriter out = new PrintWriter(new FileWriter("src"))) {
            System.out.println("Inside try block");
        }
    }

    public static void main(String[] args) throws IOException {

        tryWithTest();
    }
}

