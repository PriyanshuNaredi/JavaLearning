import java.util.Scanner;

public class Simple_intreset {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter amount of loan taken ");
        int p = in.nextInt();
      
        System.out.print("time ");
        int time= in.nextInt();
       
        System.out.print("rate ");
        int rate= in.nextInt();

        int si = (p*rate*time)/100;
        System.out.println("SI =  " +si);
        int amt=si+p;
        System.out.println("amount " +amt);


    }
    
}
