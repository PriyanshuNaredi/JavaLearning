//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenNoOfDigits {
    public static void main(String[] args) {
    int[] nums = {12,345,2,6,7896};
        System.out.println(digits(44));


    }
    static int Findnumbers(int[] nums){
    int count=0;

        for (int num:nums){
        if (even(num)){
            count++;
        }
    }
    return count;
    }

    static boolean even(int num) {
        int nod=digits(num);
        return nod % 2 == 0;
    }
//    static int digits(int num) {
//        if (num<0){
//            num=num*-1;
//        }
//        if (num==0){
//            return 1;
//        }
//        int count=0;
//        while (num>0){
//            count++;
//            num=num/10;
//        }
//        even(count);
//        return count;
//    }
    static int digits(int num){
        return (int)(Math.log10(num))+1;
    }
}
