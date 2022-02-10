import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any no.");
        int roll_no = input.nextInt();
        int a = roll_no % 2;
        if (a==0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }

}
