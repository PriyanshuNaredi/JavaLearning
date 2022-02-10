import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {11,22,33},
                {111,222,333}
        };
        int target=3;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(search(arr, target)));
        int m=max(arr);
        System.out.println(m);
    }

    private static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    private static int max(int[][] arr) {
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
