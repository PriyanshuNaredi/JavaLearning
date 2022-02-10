package com.Priyanshu;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID=in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("print emp no. 1");
            case 2 -> System.out.println("print emp no. 2");
            case 3 -> {
                System.out.println("print emp no. 3");
                switch (department) {
                    case "IT" -> System.out.println("it");
                    case "Management" -> System.out.println("management");
                    default -> System.out.println("no department enterd");
                }
            }
        }
    }
}
