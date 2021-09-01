package com.mycompany.Exceptions;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (IOException e) {
            Logger logger = Logger.getLogger("com.mycompany.Exceptions.logger");
            for (StackTraceElement element : e.getStackTrace()) {
                logger.log(Level.WARNING, element.getMethodName());
            }
        }
    }
}
