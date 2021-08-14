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



/*
Case 2: When supertypes share a common ancestor.
Methods that are already overridden are ignored
 */

interface WildAnimal extends Animal {
    default String whoAmI() {
        return "WildAnimal";
    }
}

interface FourLeggedAnimal extends Animal {
}

class Lion implements WildAnimal, FourLeggedAnimal {
    /*
    Here the supertypes `WildAnimal` and `FourLeggedAnimal` both have whoAmI().
     */
}


public class MethodConflictResolution {
    public static void main(String[] args) {

        //Case1:
        Cat cat = new Cat();
        System.out.println(cat.whoAmI());

        //Case 2:
        /*
        Here, FourLeggedAnimal's version of whoAmI() returns "Animal"(through inheritance)
        but WildAnimal's version returns "WildAnimal"(by overriding the supertype method).
        Since FourLeggedAnimal's version is already overridden in WildAnimal, WildAnimal's version is preferred.
         */
        Lion lion = new Lion();
        System.out.println("\n" + lion.whoAmI());
    }
}
