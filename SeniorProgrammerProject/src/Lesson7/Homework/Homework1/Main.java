package Lesson7.Homework.Homework1;

public class Main {
    public static void main(String[] args) {
        int min = 20;
        int max = 150;

         int rn = (int) Math.round(Math.random() * (max - min) + min);

        System.out.println("Result: " + rn);
    }
}
