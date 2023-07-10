package Lesson4.Homeworks.Homework3.Models;

public class Calc {

    public double calculate(int firstNumber, char operator, int secondNumber){
        double result = switch (operator){
            case '+' -> sum(firstNumber, secondNumber);
            case '-' -> minus(firstNumber, secondNumber);
            case '*' -> multiplication(firstNumber, secondNumber);
            case '/' -> divide(firstNumber, secondNumber);
            default -> 0;
        };

        return result;
    }

    private double sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    private double minus(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    private double multiplication(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    private double divide(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
}
