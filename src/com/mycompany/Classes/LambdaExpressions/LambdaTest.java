package com.mycompany.Classes.LambdaExpressions;


import java.util.List;

public class LambdaTest {

    //Sample criterion: get person older that given age and do some action(here print) on them.
    //Drawback of this approach is that you will have to create a new method for each new criterion.
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
