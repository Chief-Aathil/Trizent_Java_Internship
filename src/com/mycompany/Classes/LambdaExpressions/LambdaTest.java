package com.mycompany.Classes.LambdaExpressions;


import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTest {

    interface CheckPerson {
        boolean test(Person p);
    }

    /*
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

    /*
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


    /*
     * Approach3:
     * You can create a Local Class for each new search criteria. This class should implement
     * an interface which can be used by the action to make it future-proof(ie, changes in the Person class
     * will not require changes in the usage, but only in the Local Class.)
     * Also, you will need to create new Local Class for new search criterion.
     */

    /*
     * Approach4:
     * Instead of new Local class you can use Anonymous class while calling printPerson(). This will make the
     * code more concise.
     */
    public static void printPersons(List<Person> list, CheckPerson tester) {
        for (Person p : list) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }


    /*
     *Approach6:
     *Using Standard Function instead of checkPerson.test().
     * This removes the need to create the checkPerson interface.
     */
    public static void printPersonsWithPredicate(List<Person> list, Predicate<Person> tester) {
        for (Person p : list) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    /*
     *Approach 7:
     * Using Lambda expressions more extensively.
     * Instead of calling printPerson of Person class, you can replace it with a lambda expression by using
     * appropriate standard interface.
     * Here you are effectively replacing the action to be performed on the matched persons.
     * You can still use printPerson however you can perform any other action,when needed, at function call
     * without changing function definition.
     */
    public static void processPersons(
            List<Person> list,
            Predicate<Person> tester,
            Consumer<Person> block) {
        for (Person p : list) {
            if (tester.test(p)) {
                block.accept(p); //accept() is used instead of printPerson in Person class.
            }
        }
    }

    /*Another example for Approach 7
     *Lambda expression with return.
     * A call to this function can use one Lambda expression to return a String
     * which can be then used to call another Lambda expression
     */
    public static void processPersonsWithFunction(
            List<Person> list,
            Predicate<Person> tester,
            Function<Person, String> mapper,
            Consumer<String> block) {
        for (Person p : list) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }


    /*
     *Approach 8:
     *Using generics so that this logic can be applied to other class besides Person class
     */
    public static <X, Y> void processElements(
            Iterable<X> source,
            Predicate<X> tester,
            Function<X, Y> mapper,
            Consumer<Y> block) {
        for (X item : source) {
            if (tester.test(item)) {
                Y data = mapper.apply(item);
                block.accept(data);
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
        System.out.println("\nApproach1: Person with age>15");
        testObj.printPersonOlderThan(personList, 15); //Approach 1
        System.out.println("\nApproach 2: Person with age=[15,40]");
        testObj.printPersonWithinRange(personList, 15, 40);//Approach2

        //Approach3:
        //This is the class for defining search criterion.
        System.out.println("\nApproach3:18+M Using Local class");
        class CheckPersonForAdultMale implements CheckPerson {
            public boolean test(Person p) {
                return p.getAge() > 18 && p.gender == Person.SEX.MALE; //18+ Male
            }

        }
        printPersons(personList, new CheckPersonForAdultMale());

        //Approach4:
        //use Anonymous class for defining search criterion.
        System.out.println("\nApproach4:18+M Using Anonymous class");
        printPersons(personList,
                new CheckPerson() {
                    public boolean test(Person p) {
                        return p.gender == Person.SEX.MALE && p.getAge() >= 18; //18+ Male
                    }
                });

        //Approach5:
        //Using Lambda Expressions instead of Anonymous class since the interface is a functional interface.
        //This further reduces the code required.
        //Here arg is the argument passed to the function(implementation of checkPerson.test
        //and the body of the function is preceded by the arrow token( -> )
        System.out.println("\nApproach5:18+M Using Lambda Expressions");
        printPersons(personList,
                arg -> arg.gender == Person.SEX.MALE
                        && arg.getAge() >= 18);

        /*
        Approach6:
        Using Standard Predicate function
         */
        System.out.println("\nApproach6: Using standard function");
        printPersonsWithPredicate(personList,
                p -> p.gender == Person.SEX.MALE
                        && p.getAge() >= 18);

         /*
        Approach 7:
        Using Lambda expressions more extensively
         */
        System.out.println("\nApproach 7: Using Lambda expressions more extensively");
        processPersons(
                personList,
                p -> p.gender == Person.SEX.MALE
                        && p.getAge() >= 18,
                b -> b.printPerson()
        );

        /*
        Approach 7: Second example
         */
        System.out.println("\nApproach 7: Second example");
        processPersonsWithFunction(
                personList,
                p -> p.gender == Person.SEX.MALE
                        && p.getAge() >= 18,
                b -> b.name + " is " + b.getAge() + " years old.",
                out -> System.out.println(out)
        );

        /*
        Approach 8:
        Using generics
         */
        System.out.println("\nApproach 8: Using generics");
        processElements(
                personList,
                p -> p.gender == Person.SEX.MALE
                        && p.getAge() >= 18,
                p -> p.name + " is " + p.getAge() + " years old.",
                out -> System.out.println(out)
        );

        /*
         *Approach 9:
         * Using Aggregate operations that accept lambda expressions as parameters.
         */
        System.out.println("\nApproach 9: Using Aggregate Operations");
        personList
                .stream()
                .filter(
                        p -> p.gender == Person.SEX.MALE
                                && p.getAge() >= 18
                )
                .map(
                        p -> p.name + " is " + p.getAge() + " years old."
                )
                .forEach(
                        out -> System.out.println(out)
                );
    }
}
