package com.mycompany.Inheritance;

/*
Case 1: Conflict between instance method and default interface method.
Instance methods are preferred over default interface methods.
 */
interface Animal {
    default String whoAmI() {
        return "Animal";
    }
}

class Mammal {
    public String whoAmI() {
        return "Mammal";
    }
}

class Cat extends Mammal implements Animal {

}

public class MethodConflictResolution {
    public static void main(String[] args) {

        //Case1:
        Cat cat = new Cat();
        System.out.println(cat.whoAmI());
    }
}
