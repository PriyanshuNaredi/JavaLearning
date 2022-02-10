package com.Priyanshu;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(44);
        list.add(4422);
        list.add(22);
        System.out.println(list);
        System.out.println(list.contains(33));
        list.set(0,99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        for (int i = 0 ; i<5;i++){
            list.add(in.nextInt());
        }
        System.out.println(list);
    }
}
