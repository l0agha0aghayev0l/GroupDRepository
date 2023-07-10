package Lesson3;

import Lesson3.Model.Human;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setValue("Azizaga", "Quliyev", 12, "Azerbaijan");
//        System.out.println(h.getValue());

        Human h2 = new Human();
        h2.setValue("Ayxan", "Qadirli", 15, "Azerbaijan");
//        System.out.println(h1.getValue());

        System.out.println(h1.getValue() + "\n" + h2.getValue());
    }
}
