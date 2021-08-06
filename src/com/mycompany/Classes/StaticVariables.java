package com.mycompany.Classes;

class ClassA {
    public static String str = " default static string";

}

public class StaticVariables {
    public static void main(String[] args) {
        System.out.println(ClassA.str);
        ClassA obj = new ClassA();
        System.out.println(obj.str); //Discouraged form of accessing static fields
    }
}
