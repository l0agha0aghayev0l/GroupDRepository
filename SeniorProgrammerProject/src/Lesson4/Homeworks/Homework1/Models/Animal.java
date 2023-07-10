package Lesson4.Homeworks.Homework1.Models;

public class Animal {

    private String name;
    private int age;
    private String color;
    private String country;

    public void setValue(String name, int age, String color, String country){
        this.name = name;
        this.age = age;
        this.color = color;
        this.country = country;
    }

    public String getValue(){
        return "Animal{" +
                "\nName: " + name +
                "\nAge: " + age +
                "\nColor: " + color +
                "\nCountry: " + country +
                "\n}";
    }
}
