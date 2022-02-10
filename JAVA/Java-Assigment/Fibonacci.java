import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("enter any no. to genrate Fibonacci series till ");
        Scanner in = new Scanner(System.in);
        int count = input.nextInt();
        int f0 = 0;
        int f1 = 1;
        int f,i;
        System.out.print(f0+" "+f1);
        for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
        {
            f = f0 + f1;
            System.out.print(" " + f);
            f0 = f1;
            f1 = f;
        }    
    }
}
