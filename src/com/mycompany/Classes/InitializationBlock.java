package com.mycompany.Classes;

public class InitializationBlock {
    public static String staticVar;
    public static String staticVar2;
    public String instanceVar;
    public String instanceVar2;

    static {
        staticVar = "staticVar initialized from static block";
    }

    {
        instanceVar2 = "instanceVar2 initialized from instance initialization block";
    }

    public InitializationBlock() {
//        InitializationBlock.staticVar="staticVar initialized from default constructor";
        instanceVar = "instanceVar initialized from default constructor";
        initStaticVar();
    }

    public InitializationBlock(String s) {
        InitializationBlock.staticVar = "staticVar initialized from  constructor 1";
        instanceVar = s;
        initStaticVar();
    }

    public static void initStaticVar() {
        staticVar2 = "staticVar2 initialized from initStaticVar()";
    }

    public String toString() {
        String str;
        str = "staticVar: " + staticVar + "\ninstanceVar: " + instanceVar +
                "\ninstanceVar2: " + instanceVar2 + "\nstaticVar2: " + staticVar2;
        return str;
    }

    public static void main(String[] args) {
        InitializationBlock obj1 = new InitializationBlock();
        System.out.println("obj1:\n" + obj1.toString());
        InitializationBlock obj2 = new InitializationBlock("Passed Parameter");
        System.out.println("obj2:\n" + obj2.toString());


    }
}
