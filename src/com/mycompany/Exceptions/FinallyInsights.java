package com.mycompany.Exceptions;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

public class FinallyInsights {

    public static void main(String[] args) {
        try {
            System.out.println("Current Thread:" + Thread.currentThread().getName());
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Current Thread:" + Thread.currentThread().getName());
        } finally {
            System.out.println("Current Thread:" + Thread.currentThread().getName());
        }
    }
}
