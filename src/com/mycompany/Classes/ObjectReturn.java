package com.mycompany.Classes;

class GrandParent {
    String name = "GrandParent";
}

class Parent extends GrandParent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";
}


public class ObjectReturn {


    //This is an example for covariant return type
    public static Parent getObject() {
        return new Child();  // Can return an object of subclass(Child)  of the return-type-class(Parent) of the method
    }

//    public static Parent func(){
//        return new GrandParent(); // Returned object shouldn't be of a parent-class(GrandParent) type
//    }


    public static void main(String[] args) {
        GrandParent obj = ObjectReturn.getObject();
        System.out.println(obj.name);


    }

}
