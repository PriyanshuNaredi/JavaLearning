package com.Priyanshu;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//       String msg =  greet();
//        System.out.println(msg);
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name :");
        String name = in.nextLine();
        String person =myGreet(name);
        System.out.println(person);
    }

    private static String myGreet(String name) {
       String message = "Hello "+name;
       return message;
    }

    static String greet(){
        String greeting = "hello!!!!";
        //return 22;
        return greeting;
    }
}
