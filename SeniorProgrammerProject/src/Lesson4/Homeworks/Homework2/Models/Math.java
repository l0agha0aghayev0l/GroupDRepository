package Lesson4.Homeworks.Homework2.Models;

public class Math {

    public int multiplication(int... numbers){
        int result = 1;
        for (int i: numbers) {
            result *= i;
        }
        return result;
    }

    public int sum(int... numbers){
        int result = 0;
        for (int i: numbers) {
            result += i;
        }
        return result;
    }
}
