package com.mycompany.Inheritance;

class SuperClass {
    String methodFunc() {
        return "SuperClass";
    }

    static String staticFunc() {
        return "staticSuper";
    }
}

class SubClass extends SuperClass {
    String methodFunc() {
        return "SubClass";
    }

    static String staticFunc() {
        return "staticSub";
    }
}

class AnotherSubClass extends SuperClass {

}

public class MethodHiding {

    public static void main(String[] args) {
        SuperClass superObj = new SubClass();
        SubClass subObj = new SubClass();
        AnotherSubClass anotherSubObj = new AnotherSubClass();

        System.out.println(superObj.methodFunc());
        System.out.println(SubClass.staticFunc());
        System.out.println(AnotherSubClass.staticFunc());

    }
}
