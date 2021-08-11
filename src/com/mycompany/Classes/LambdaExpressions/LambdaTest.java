package com.mycompany.Classes.LambdaExpressions;


import java.util.List;

public class LambdaTest {

    interface CheckPerson {
        boolean test(Person p);
    }

    /**
     * Approach1:
     * Sample criterion: get person older that given age and do some action(here print) on them.
     * Drawback of this approach is that you will have to create a new method for each new criterion.
     */
    public void printPersonOlderThan(List<Person> list, int age) {
        for (Person p : list) {
            if (p.getAge() > age) {
                p.printPerson();
            }
        }
    }

    /**
     * Approach2:
     * Create a more flexible search method.You could create a method that will some arguments to check for a
     * pattern ( eg: age<x, name starts with 'A', MALE). For simplicity, we are showing function that can take
     * upper and lower bound of age to search. The drawback of this approach is that we will need to change the
     * search method whenever we update the Person class(like when we add/ change fields).
     * This approach is only slightly more generic than printPersonOlderThan in Approach1.
     */
    public void printPersonWithinRange(List<Person> list, int lowerAge, int upperAge) {
        for (Person p : list) {
            if (p.getAge() >= lowerAge && p.getAge() <= upperAge) {
                p.printPerson();
            }
        }
    }


    /**
     * Approach3:
     * You can create a Local Class for each new search criteria. This class should implement
     * an interface which can be used by the action to make it future-proof(ie, changes it the Person class
     * will not require changes in the usage, but only in the Local Class.
     * Also, you will need to create new Local Class for new search criterion.
     */
    public static void printPersons(List<Person> list, CheckPerson tester) {
        for (Person p : list) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        LambdaTest testObj = new LambdaTest();
        List<Person> personList = Person.constructList();
        System.out.println("The list is:");
        for (Person p : personList) {
            p.printPerson();
        }
        System.out.println("\nSearching...");
        //testObj.printPersonOlderThan(personList, 15); //Approach 1
        //testObj.printPersonWithinRange(personList, 15, 40);//Approach2

        //Approach3:
        //This is the class for defining search criterion.
        class CheckPersonForAdultMale implements CheckPerson {
            public boolean test(Person p) {
                return p.getAge() > 18 && p.gender == Person.SEX.MALE;//18+ Male
            }

        }
        printPersons(personList, new CheckPersonForAdultMale());
    }
}
