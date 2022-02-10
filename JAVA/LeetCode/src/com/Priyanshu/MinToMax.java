package com.Priyanshu;

public class MinToMax {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
//        System.out.println(max(arr));
    }

     static void max(int[] arr) {
        int maxv=arr[0];
        for (int i = 1 ; i<arr.length;i++){
            if (arr[i]>maxv){
                maxv=arr[i];
            }
            System.out.println(maxv);
        }
//        return maxv;
    }
}
