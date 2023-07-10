package Lesson4.Lecture;

import Lesson4.Lecture.Models.ABS;
import Lesson4.Lecture.Models.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setValue("John", "Doe", 36);

        Human human1 = new Human();
        human1.setValue("John", "Doe", 36);
        System.out.println(human.equals(human1));

    }
}
