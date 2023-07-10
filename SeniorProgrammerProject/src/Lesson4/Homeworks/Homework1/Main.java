package Lesson4.Homeworks.Homework1;

import Lesson4.Homeworks.Homework1.Models.Animal;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setValue("Dog", 5, "Brown", "USA");
        System.out.println(animal.getValue());

        Animal animal1 = new Animal();
        animal1.setValue("Cat", 4, "Ginger", "Germany");
        System.out.println(animal1.getValue());
    }
}
