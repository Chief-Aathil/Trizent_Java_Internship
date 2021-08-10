package com.mycompany.Classes.LambdaExpressions;


import java.util.List;

public class LambdaTest {

    public void printPersonOlderThan(List<Person> list, int age) {
        for (Person p : list) {
            if (p.getAge() > age) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        LambdaTest testObj = new LambdaTest();
        List<Person> personList = Person.constructList();
        testObj.printPersonOlderThan(personList, 15);
    }
}
