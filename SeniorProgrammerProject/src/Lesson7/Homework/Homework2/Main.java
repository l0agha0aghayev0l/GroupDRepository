package Lesson7.Homework.Homework2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(randomizer(10, 12));
    }

//    public static int randomizer(int min, int max){
//        Random random = new Random();
//        return random.nextInt(min, max);
//    }
//
    public static int randomizer(int min, int max){
        return (int) (Math.random() * (max - min) + min);
    }
}
