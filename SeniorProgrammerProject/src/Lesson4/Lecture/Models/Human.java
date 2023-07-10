package Lesson4.Lecture.Models;

import java.util.Objects;

public class Human {

    String name;
    String surname;
    int age;

    public void setValue(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

//    @Override
//    public String toString() {
//        return "Human{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
