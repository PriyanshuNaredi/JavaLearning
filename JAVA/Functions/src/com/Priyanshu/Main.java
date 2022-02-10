package com.Priyanshu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println(ans);
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st no. ");
        int num1 = in.nextInt();
        System.out.println("enter 2nd no. ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
       // System.out.println("this will not be printed");
    }
    static void sum(){

        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st no. ");
        int num1 = in.nextInt();
        System.out.println("enter 2nd no. ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("sum = "+sum);

    }
}
