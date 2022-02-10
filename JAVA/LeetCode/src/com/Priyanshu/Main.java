package com.Priyanshu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int[] arr = {1,2,3,4};
        System.out.print(Arrays.toString(arr));
        AddPermutation(arr);
    }
     static void AddPermutation(int[] arr) {

         int sum = 0;
         for (int i = 0; i < 4; i++) {

//             for (int j = 0; j < 4; j++) {
//                 int[] ar=new int[4];
//                 ar[j]=temp;
//                 System.out.print(Arrays.toString(ar));
//             }

             int ros[]= new int[4];
             for (int j = 0; j < ros.length; j++) {
                 ros[j]=sum;
                 System.out.println(Arrays.toString(ros));
             }
//             System.out.println(sum);


         }
     }

}

