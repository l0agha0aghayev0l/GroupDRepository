package Lesson5.Homeworks.Exercise2.Models;

public class Calc {

//    private int result;

    public int calc(int a, char operator, int b){
      int result = switch (operator){ // int result is local variable
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
        return result;
    }
}
