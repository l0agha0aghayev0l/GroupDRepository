package Lesson6.Theory;

import Lesson6.Theory.Models.Human;

public class Main {
    public static void main(String[] args) {
//
//        String s;
//
//        int i;
//
//        char c;
//
//        Human h;
//
//        Human human = new Human();
//
//        human.setValue("John", 20, "USA");
//
//        Human human1 = new Human();
//        human1.setValue("Ilqar", 89, "Honduras");
//
//        System.out.println(human.getValue());
//        System.out.println(human1.getValue());
//



//        int i = 100;
//        byte b = (byte) i; //casting
//        short s = (byte) i; //casting
//
//        String str = "sdkaodpaksda";
//
//        Integer in = new Integer(34);
//        int i = 50;
//        Integer integer = i;
//
//        if (true){
//            int ab = 445;
//        } else {
//            ab = 126;
//        }


        double d = 12.5;
        int i = (int)d; //casting


        int f = 240;
        short s = (byte) f;

        int a  = 50;


        Human human = new Human();
        human.setValue("John", 21, "USA");

        method(a);


        System.out.println("In main" + a);

        method(human);
        System.out.println("In main: " + human.getValue());

    }

    public static void method(int a){
        a = 100;
        System.out.println("In method: " + a);
    }

    public static void method(Human human){
        human.setValue("Ahmed", 50, "Khazahstan");
        System.out.println("In method: " + human.getValue());
    }
}
