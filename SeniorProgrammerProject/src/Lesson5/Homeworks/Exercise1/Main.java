package Lesson5.Homeworks.Exercise1;

import Lesson5.Homeworks.Exercise1.Models.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setValue("John", "Doe", 36);

        Person person1 = new Person();
        person1.setValue("John", "Doe", 36);

        System.out.println(person);
        System.out.println(person1);

        System.out.println(person.equals(person1));

    }
}
