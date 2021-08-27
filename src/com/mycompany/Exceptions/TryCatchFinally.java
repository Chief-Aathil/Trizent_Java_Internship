package com.mycompany.Exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TryCatchFinally {
    public static void main(String[] args) {
        PrintWriter fileOut = null;
        try {
            fileOut = new PrintWriter(new FileWriter("src"));

            System.out.println("Test line");//not executed if exception thrown from line above
        } catch (IOException e) {
            System.out.println("Exception caught!!");
            e.printStackTrace();
            System.out.println("Stack trace printed");
        } finally {
            System.out.println("In finally block...");
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }
}
