package Lesson1;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please, input the name:");
//        String user = sc.next();
//        System.out.println("Please, input the age:");
//        int age = sc.nextInt();
//        System.out.println("Name: " + user + " Age: " + age);

//        String name = JOptionPane.showInputDialog("Please, input the name:");
//        String surname = JOptionPane.showInputDialog("Please, input the surname:");
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Please, input the age:"));
//        String result = "Name: " + name + " Surname: " + surname + " Age: " + age;
//        JOptionPane.showMessageDialog(null, "Name: " + name + " Surname: " + surname + " Age: " + age);

        //HomeWork
        //--------------------------1--------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please, input the first number:");
//        int a = sc.nextInt();
//        System.out.println("Please, input the second number:");
//        int b = sc.nextInt();
//        System.out.println("a + b = " + (a+b));

        //--------------------------2--------------------------------
//        int a = Integer.parseInt(JOptionPane.showInputDialog("Please, input the first number:"));
//        int b = Integer.parseInt(JOptionPane.showInputDialog("Please, input the second number:"));
//
//        JOptionPane.showMessageDialog(null, "a + b = " + (a + b));


        //DataType
        //---------------------------Identification------------------------------
//
//        int lowerCamelCase;
//
//        byte b;
//        short s;
//        int i;
//        long l = 384739423478L;
//
//        float f = 12.6f;
//        double d;
//
//        boolean tr;
//        boolean fl;
//
//        char c = 'd';
//
//        var v = "sd";

//        Random r = new Random();
//        int i = r.nextInt(1, 100);
//        double d = r.nextDouble(1.0, 12.5);
//        boolean b = r.nextBoolean();
//
//        System.out.println(i);
//        System.out.println(d);
//        System.out.println(b);


// Math.random() * a + b -> a = max - min; b = min;
//        int db = (int)(Math.random() * 99 + 1);
//        double db2 = Math.random();
//        System.out.println(db);
//        System.out.println(db2);

//        final double g;
//         g = 9.8;
//

//// OPERATORS
//        int a = 12;
//        int b = 14;
//
//        //Logical Operators -> result = true/false;
//
//        System.out.println("The result of a == b: " + (a == b));
//        System.out.println("The result of a > b: " + (a > b));
//        System.out.println("The result of a < b: " + (a < b));
//        System.out.println("The result of a > b: " + (a >= b));
//        System.out.println("The result of a > b: " + (a <= b));
//        System.out.println("The result of a > b: " + (a != b));
//
//
//        //Arif. Operators
//        a = 20;
//        b = 10;
//        System.out.println("a + b = " + (a + b));
//        System.out.println("a - b = " + (a - b));
//        System.out.println("a * b = " + (a * b));
//        System.out.println("a / b = " + (a / b));
//        System.out.println("a % b = " + (a % b));
//
//        int c;
//
//        c = 50;
//        c += a; //c = c + a;
//        System.out.println(c);
//
//        c = 50;
//        c -= a; //c = c - a;
//        System.out.println(c);
//
//        c = 50;
//        c *= a; //c = c * a;
//        System.out.println(c);
//
//        c = 50;
//        c /= a; //c = c / a;
//        System.out.println(c);
//
//        c = 50;
//        c %= a; //c = c % a;
//        System.out.println(c);

//HOMEWORK
//----------------#1-----------------------------
//        Random random = new Random();
//        int a = random.nextInt(1, 100);
//        int b = random.nextInt(1, 100);
//        System.out.println("The result of " + a + " > " + b + ": " + (a > b));

//-----------------#2-----------------------------
//        Scanner sc = new Scanner(System.in);
//        Random r = new Random();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int result = r.nextInt(a, b);
//        System.out.println(result);

//        int i = 5;
//
//        i++; //i = i + 1; increment
//        System.out.println(i);
//
//        i--; //i = i - 1; decrement
//        System.out.println(i);


        // IF
//        Random r = new Random();
//        int a = r.nextInt(1, 10);
//        int b = r.nextInt(1, 10);
//
//        System.out.println("a = " + a +", b = " + b);
//
//        if (a > b){
//            System.out.println("а больше чем b");
//        } else if (a < b){
//            System.out.println("a меньше чем b");
//        } else {
//            System.out.println("a равно b");
//        }

//        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();

//        if (a == 1){
//            System.out.println(1);
//        } else if (a == 2) {
//            System.out.println(2);
//        } else if (a == 3) {
//            System.out.println(3);
//        } else if (a == 4) {
//            System.out.println(4);
//        } else{
//            System.out.println(0);
//        }

        //SWITCH
//        switch (a){
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            case 4:
//                System.out.println(4);
//                break;
//            case 5:
//                System.out.println(5);
//                break;
//            case 6:
//                System.out.println(6);
//                break;
//            case 7:
//                System.out.println(7);
//                break;
//            case 8:
//                System.out.println(8);
//                break;
//            case 9:
//                System.out.println(9);
//                break;
//            case 10:
//                System.out.println(10);
//                break;
//            default:
//                System.out.println("Not Found");
//                break;
//        }

//        String s = sc.nextLine();
//
//        int result = switch (s){
//            case "one" -> 1;
//            case "two" -> 2;
//            case "three" -> 3;
//            case "four" -> 4;
//            case "five" -> 5;
//            case "six" -> 6;
//            case "seven" -> 7;
//            case "eight" -> 8;
//            case "nine" -> 9;
//            case "ten" -> 10;
//            default -> 0;
//        };
//
//        System.out.println(result);


//LOOP
        //WHILE
//
//        int i = 0;
//
//        while (i < 10){
//            i++;
//            System.out.println(i);
//
//        }

        //DO WHILE

//        int i = 0;
//
//        do {
//            i++;
//            System.out.println(i);
//        } while(i<10);

        //FOR

//        for(int i = 0; i <= 10; i+=2){
//            System.out.println(i);
//        }


        // FOREACH

//        int a = 5;
//
//        int[] arr = {12,45, 23, 40};
//
//        int[] arr2 = new int[10];
//
//        arr2[4] = 15;


//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }

//        for (int i: arr){
//            System.out.println(i);
//        }

//        for (int j: arr2) {
//            System.out.println(j);
//        }


        //HOMEWORK

        //HW1
//        Random r = new Random();
//        int[] arr = new int[100];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt(1, 100);
//            System.out.println(arr[i]);
//        }
//
//        System.out.println();
//
//        for (int j: arr) {
//            if (j % 2 == 0){
//                System.out.println(j);
//            }
//        }

        //HW2
//        Random r = new Random();
//        int[] arr = new int[5];
//        double result = 0;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt(1, 10);
//            System.out.println(arr[i]);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            result += arr[i];
//        }
//
//        result /= arr.length;
//
//        System.out.println("Средняя арифметическая равно: " + result);

        //HW3
//        Random r = new Random();
//        int[] arr = new int[10];
//
//        int max = 0;
//        int min = 100;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt(1, 100);
//
//            if(arr[i] > max){
//                max = arr[i];
//            }
//
//            if (arr[i] < min){
//                min = arr[i];
//            }
//
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("Max: " + max);
//        System.out.println("Min: " + min);

        //HW4

//        int a = Integer.parseInt(JOptionPane.showInputDialog("Input the first number"));
//        char c = JOptionPane.showInputDialog("Input the operator").charAt(0);
//        int b = Integer.parseInt(JOptionPane.showInputDialog("Input the second number"));

//        int result = switch (c){
//            case '+' -> a + b;
//            case '-' -> a - b;
//            case '*' -> a * b;
//            case '/' -> a / b;
//            default -> 0;
//        };


//        JOptionPane.showMessageDialog(null, "The operation's result is " + result);

        //ARRAYS CLASS
        //copyOf()
//        int[] a = {1, 12, 45, 67, 33};
//        int[] b = Arrays.copyOf(a, 3);
//
//        System.out.println("a array:");
//        for (int i: a) {
//            System.out.println(i);
//        }
//
//        System.out.println("b array:");
//        for (int j: b) {
//            System.out.println(j);
//        }

        //copyOfRange
//        int[] a = {1, 2, 3, 4, 5};
//        int[] b = Arrays.copyOfRange(a, 1, 3);
//
//        System.out.println("a array:");
//        for (int i: a) {
//            System.out.println(i);
//        }
//
//        System.out.println("b array:");
//        for (int j: b) {
//            System.out.println(j);
//        }

        //toString
//        int[] a = {10, 12, 56, 11, 89, 4, 156, 72, 22, 65};
//
//        System.out.println(Arrays.toString(a));

        //fill
//        int[] a = {10, 12, 56, 11, 89, 4, 156, 72, 22, 65};
//        Arrays.fill(a, 10);
//        System.out.println(Arrays.toString(a));

        //sort
//        int[] a = {10, 12, 56, 11, 89, 4, 156, 72, 22, 65};
//        Arrays.sort(a);
//
//        System.out.println(Arrays.toString(a));

        //binarySearch
//        int[] a = {10, 12, 56, 11, 89, 4, 156, 72, 22, 65};
//        Arrays.sort(a);
//
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.binarySearch(a, 66));

        //equals
//        int[] a = {1, 2, 4, 6, 9};
//        int[] b = {1, 2, 4, 6, 9};
//
//        System.out.println(Arrays.equals(a, b));

//--------------------------------------------------------------------

        //Homework
//        Random r = new Random();
//        int[] arr = new int[10];
//        int average = 0;
//
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = r.nextInt(1, 10);
////            System.out.println("Период цикла " + i);
//        }
//
//        for (int j: arr){
//            average += j;
//        }
//        average/= arr.length;
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println("Средняя арифметическа: " + average);
//
//        System.out.println("Порядковый номер: " + Arrays.binarySearch(arr, average));
    }
}