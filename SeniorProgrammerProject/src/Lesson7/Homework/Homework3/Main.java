package Lesson7.Homework.Homework3;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        int min = 20;
        int max = 100;

        int a = (int) round(random() * (max - min) + min);
        int b = (int) round((random() * (max - min) + min));

        System.out.println("Max value: " + max(a, b));
        System.out.println("Min value: " + min(a, b));
    }
}
