import java.util.Scanner;

public class Greater {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("input any integr ");
        int a= in.nextInt();
        int b= in.nextInt();
        if (a>b) {
            System.out.println(a+">"+b);
        }
        else {
            System.out.println(a+"<"+b);
        }
    }
    
}
