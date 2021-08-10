package com.mycompany.Classes.LambdaExpressions;

import java.time.LocalDate;

public class Person {
        public enum SEX {
                MALE, FEMALE
        }

        String name;
        SEX gender;
        int age;

        public int getAge() {
                return this.age;
        }

        public void printPerson() {

        }
}
