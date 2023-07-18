package Lesson7.Theory;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("abs(-12):" + abs(-12)); //12

        System.out.println("pow(2, 5): " + pow(2, 5)); // 2 * 2 * 2 * 2 * 2

        System.out.println("sqrt(16): " + sqrt(16)); //4

        System.out.println("cbrt(8): " + cbrt(8)); //2; 2^3 = 2 * 2 * 2 = 8

        System.out.println("round(12.5): " + round(12.5)); //13

        System.out.println("floor(25.8): " + floor(25.8)); //25

        System.out.println("ceil(29.00001): " + ceil(29.00001));//30

        System.out.println("random(): " + random()); // 0<=x<=1

        System.out.println("random(20, 100): " + (int)(random() * 80 + 20));

        System.out.println("max(30, 45): " + max(30, 45)); //45

        System.out.println("min(30, 45): " + min(30, 45)); //30
    }
}
