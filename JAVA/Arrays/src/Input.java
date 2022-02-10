import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // arry of primritives
        int[] arr = new int[5];
//        arr[0]=1;
//        arr[1]=1;
//        arr[2]=1;
//        arr[3]=441;
//        arr[4]=1;
//        System.out.println(arr[3]);
//
        /*

         */
        for (int i = 0;i <  arr.length;i++){
            arr[i]= in.nextInt();
        }

        for (int i = 0;i <  arr.length;i++){
            System.out.print(arr[i]);

            System.out.println();
        }
        /*
            Enhanced For loop
         */
        for (int num : arr){
            System.out.print(num);//num represents element of array
        }
        /*
        Easy Way Of printing Array
         */
        System.out.print(Arrays.toString(arr));

        // array of obj

        String[] str = new String[4];
        for (int i = 0 ; i < str.length;i++) {
            str[i] = in.next();
        }
        System.out.print(Arrays.toString(str));

    }
}
