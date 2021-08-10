package com.mycompany.Classes.LambdaExpressions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
        public enum SEX {
                MALE, FEMALE
        }

        String name;
        SEX gender;
        int age;

        public Person(String n, SEX sex, int age) {
                name = n;
                gender = sex;
                this.age = age;
        }

        public int getAge() {
                return this.age;
        }

        public void printPerson() {
                System.out.println("Name: " + name + "\t Sex: " + gender + " \tage: " + age);
        }

        public static List<Person> constructList() {
                List<Person> list = new ArrayList<>();
                list.add(new Person("Person1", SEX.MALE, 10));
                list.add(new Person("Person2", SEX.FEMALE, 20));
                list.add(new Person("Person3", SEX.MALE, 30));
                return list;
        }

}
