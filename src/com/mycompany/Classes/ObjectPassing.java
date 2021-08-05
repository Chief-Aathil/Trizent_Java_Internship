package com.mycompany.Classes;

class SomeClass {
    int data;

    public SomeClass(int x) {
        this.data = x;
    }
}

public class ObjectPassing {
    public static void function(SomeClass obj, int x) {
        obj.data = x; //This will change the value in the object passed(i.e., myObject)
        SomeClass newObj = new SomeClass(300);
        obj = newObj;// This will not change the reference of the object passed(myObject)
    }

    public static void main(String[] args) {
        SomeClass myObject = new SomeClass(10);
        System.out.println("myObject.data=" + myObject.data);
        ObjectPassing.function(myObject, 200);
        System.out.println("myObject.data = " + myObject.data);
    }
}
