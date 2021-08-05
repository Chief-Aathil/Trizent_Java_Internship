package com.mycompany.Basics;

public class VarArgs {
    public void function(int... args) {
        if (args.length == 0) {
            System.out.println("Empty argument");
            return;
        }
        for (int element : args)
            System.out.println(element);
        System.out.println("args[0] = " + args[0]);
        System.out.println("Function ending");

    }


    public static void main(String[] args) {
        VarArgs obj = new VarArgs();
        int a = 20;
        obj.function(1, 2, 3);
        obj.function(new int[]{1, 2});  //redundant array creation
        obj.function(a);
        obj.function();
    }
}
