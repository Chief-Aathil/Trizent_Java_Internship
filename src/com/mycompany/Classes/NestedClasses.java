package com.mycompany.Classes;


class OuterClass {
    String outerStr = "outerStr";
    static String outerStaticStr = "outerStaticStr";
    InnerClass innerObject;
    StaticClass staticObject;
//    private static String outerPvtStaticStr;


    class InnerClass {
        public String innerStr;

        //        static String str;  //Cannot define static variables inside an inner class(non-static nested class).
        //maybe possible to do in higher language level
        public void accessOuter() {
            System.out.println("Inside InnerClass");
            System.out.println("outerPvtStr: " + outerStr);
            System.out.println("outerStaticStr: " + outerStaticStr);
        }

    }

    public InnerClass initInnerClass() {
        OuterClass.InnerClass innerObj = this.new InnerClass();
        return innerObj;
    }

    static class StaticClass {
        public static String staticClassStaticStr;
        public String staticClassStr;

        public void accessOuter(OuterClass outerObj) {
//            System.out.println(outerStr); //Cannot reference non-static variable form static nested class
            System.out.println("Insider StaticClass");
            System.out.println("outerStr: " + outerObj.outerStr);
            System.out.println("outerStaticStr: " + outerStaticStr);
        }

    }

    public OuterClass() {
        innerObject = this.initInnerClass();
        staticObject = new StaticClass();
//        OuterClass.InnerClass inObj= this.new InnerClass();
    }
}

public class NestedClasses {

    private static OuterClass obj;

    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.innerObject.accessOuter();
        obj.staticObject.accessOuter(obj);
    }
}
