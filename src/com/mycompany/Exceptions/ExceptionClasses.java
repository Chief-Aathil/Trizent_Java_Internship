package com.mycompany.Exceptions;

class MyException extends Exception {
    void printMsg() {
        System.out.println("Exception from MyException Class");
    }
}

public class ExceptionClasses {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
            e.printMsg();
        }
    }
}
