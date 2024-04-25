package recursion;

import java.util.Arrays;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr)
    {
        if(arr.length == 1) return arr[0];
        return arr[0]+sum(Arrays.copyOfRange(arr,1,arr.length));
    }
}
