package Lesson5.Homeworks.Exercise2;

import Lesson5.Homeworks.Exercise2.Models.Calc;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        int a = Integer.parseInt(JOptionPane.showInputDialog("Input the first number:"));
        char operator = JOptionPane.showInputDialog("Input the operator:").charAt(0);
        int b = Integer.parseInt(JOptionPane.showInputDialog("Input the second number:"));

        JOptionPane.showMessageDialog(null, "Result: " + calc.calc(a, operator, b));
    }
}
