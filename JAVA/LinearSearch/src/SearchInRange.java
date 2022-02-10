import java.util.Arrays;
import java.util.Scanner;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE RECQIURED SIZE FOR ARRAY: ");
        int n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("ENTER ELEMENTS OF ARRAY");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Element to be searched");
        int target=in.nextInt();
        int ans=Linear(arr,target,1,3);
        System.out.println("Ans Fount at index: "+ans);
    }

    static int Linear(int[] arr,int target,int start ,int end){
        if (arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element ==target){
                return index;
            }
        }
        return -1;
    }
    }

