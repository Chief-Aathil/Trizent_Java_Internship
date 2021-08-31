package com.mycompany.Exceptions;

import java.io.IOException;

public class ChainedException {
    public static void thrower() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public static void main(String[] args) {

        try {
            thrower();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
