package com.mycompany.Classes;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class LocalClassExample {

    String strOuter = "strOuter";

    public void function(int x) {
        System.out.println("Inside function()");
        class LocalClass {
            String localStr = "localStr";

            public void access() {
                System.out.println("strOuter: " + strOuter);
                System.out.println("Passed argument: " + x);
                System.out.println("localStr: " + localStr);
            }
        }
        LocalClass localObj = new LocalClass();
        localObj.access();
        localObj.localStr = "localStr changed";
        System.out.println("localObj.localStr: " + localObj.localStr);
    }

    public static void main(String[] args) {
        LocalClassExample obj = new LocalClassExample();
        obj.function(2);
    }

}
