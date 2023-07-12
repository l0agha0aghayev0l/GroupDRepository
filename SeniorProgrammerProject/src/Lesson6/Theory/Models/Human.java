package Lesson6.Theory.Models;

public class Human {

    private String name;
    private int age;
    private static String nation;

    public void setValue(String name, int age, String nation){
        this.name = name;
        this.age = age;
        this.nation = nation;
    }

    public String getValue(){
        return "Human{" +
                "\nName: " + name +
                "\nAge: " + age +
                "\nNation: " + nation +
                "\n}";
    }

}
