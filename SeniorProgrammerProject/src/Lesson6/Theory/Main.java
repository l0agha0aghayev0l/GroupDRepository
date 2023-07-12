package Lesson6.Theory;

import Lesson6.Theory.Models.Human;

public class Main {
    public static void main(String[] args) {

        String s;

        int i;

        char c;

        Human h;

        Human human = new Human();

        human.setValue("John", 20, "USA");

        Human human1 = new Human();
        human1.setValue("Ilqar", 89, "Honduras");

        System.out.println(human.getValue());
        System.out.println(human1.getValue());

    }
}
