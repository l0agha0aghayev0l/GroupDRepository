package Lesson3.Model;

public class Human {
    String name;
    String surname;
    int age;
    String nationality;

    public void setValue(String name, String surname, int age, String nationality){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nationality = nationality;
    }

    public String getValue(){
        return "Human{" +
                "\nName: " + name +
                "\nSurname: " + surname +
                "\nAge: " + age +
                "\nNationality: " + nationality +
                "\n}";
    }
}
