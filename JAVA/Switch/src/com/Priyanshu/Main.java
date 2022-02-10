package com.Priyanshu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//        if (fruit.equals("mango")){
//            System.out.println("king");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("keeps docter away");
//        }
//        switch (fruit){
//            case "Mango":
//                System.out.println("king");
//                break;
//            case "Apple":
//                System.out.println("keeps doctor away");
//                break;
//            default:
//                System.out.println("Hello!!!!!!");
//        }
        switch (fruit) {
            case "Mango" -> System.out.println("king");
            case "Apple" -> System.out.println("keeps doctor away");
            default -> System.out.println("Hello!!!!!!");
        }


    }
}
