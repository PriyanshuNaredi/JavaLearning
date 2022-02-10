package com.Priyanshu;

import java.util.Scanner;

public class Typecasting   {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);
//        int num = (int)(22.22f);
//        System.out.println(num);

        // Automatic type promotion in expresssions
        int a = 257;
        byte b = (byte) (a);    // 257 %256 = 1
        System.out.println(b);

        int a1 = 40;
        byte b1 = (byte) (a1);
        System.out.println(b1);


        byte A= 40; // range of byte is 256
        byte B= 50;
        byte C= 100;
        int d = (A*B)/C;
        System.out.println(d);

//        byte B1 = 50;        gives an error B1*2 converts it into int
//        B1= b1*2;             so cant store int in byte

        int number = 'A';
        System.out.println(number);

    }
}
