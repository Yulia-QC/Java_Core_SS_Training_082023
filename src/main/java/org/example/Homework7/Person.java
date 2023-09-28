package org.example.Homework7;

public class Person {
    String name;
    int age;
    Person friend;
    Person() {

    }
    Person(int ageParam, String nameParam) {
        age = ageParam;
        name = nameParam;
    }
    Person(String name, int age) {
        this(age,name);

    }
}
